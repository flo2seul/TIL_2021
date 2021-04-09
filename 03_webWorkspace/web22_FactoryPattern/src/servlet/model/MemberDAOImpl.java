package servlet.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDAOImpl implements MemberDAO{
	//추�?
	private DataSource ds;
	
	//?���??��...
	private static MemberDAOImpl dao = new MemberDAOImpl();
//	private MemberDAOImpl() {
//		try {
//			Class.forName(ServerInfo.DRIVER_NAME);
//			System.out.println("?��?��?���? 로딩 ?���?...");
//			
//		}catch(ClassNotFoundException e) {
//			System.out.println("?��?��?���? 로딩 ?��?��...");
//		}
//	}	
	
	//DataSource방식..
	private MemberDAOImpl() {
		//Naming Service....JNDI Service...?��름으�? 객체?�� ?��?��?��?�� 주소�? 받아?��?��..
		try {
			InitialContext ic = new InitialContext();
			ds = (DataSource)ic.lookup("java:comp/env/jdbc/mysql");
			System.out.println("DataSource Lookup....OK");
		} catch (NamingException e) {
			System.out.println("DataSource Lookup....Fail");
		}		
	}	
	public static MemberDAOImpl getInstance() {
		return dao;
	}
	
	@Override
	public Connection getConnection() throws SQLException {		
		System.out.println("1");
		
//		Connection conn = DriverManager.getConnection(ServerInfo.URL, "root", "1234");
//		return conn;	
		return ds.getConnection(); //?��?��값�? ?���?  Context.xml?�� ?�� ?��?���??���? ?��문에 ?��?��?��?��...공장?��?�� Connection ?��?��?�� 빌려?��?��.
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException{
		if(ps!=null) ps.close();		
		if(conn != null) conn.close();
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException{		
		if(rs != null)	rs.close();
		closeAll(ps, conn);		
	}

	@Override
	public void registerMember(MemberVO vo) throws SQLException {		
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn=  getConnection();
			String query = "INSERT INTO member VALUES(?,?,?,?)";
			ps = conn.prepareStatement(query);
			System.out.println("PreparedStatement ?��?��?��...registerMember");
			
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getAddress());
			
			System.out.println(ps.executeUpdate()+" row INSERT OK!!");
		}finally{
			closeAll(ps, conn);
		}
	}

	@Override
	public ArrayList<MemberVO> showAllMember() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<MemberVO> list = new ArrayList<>();
		try {
			conn = getConnection();
			String query = "SELECT id, password, name, address FROM member";
			ps = conn.prepareStatement(query);
			System.out.println("PreparedStatement....showAllMember()..");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new MemberVO(
						rs.getString("id"), 
						rs.getString("password"), 
						rs.getString("name"), 
						rs.getString("address")));
			}
		}finally {
			closeAll(rs, ps, conn);
		}
		return list;
	}

	@Override
	public MemberVO findByIdMember(String id) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberVO vo = null;
		try{
			conn = getConnection();
			//
			String query = "SELECT id, password, name, address FROM member WHERE id=?";
			ps = conn.prepareStatement(query);
			System.out.println("PreparedStatement....findByIdMember()..");
			
			ps.setString(1,id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				vo =  new MemberVO(id, 
								   rs.getString("password"), 
								   rs.getString("name"),
								   rs.getString("address"));
			}
		}finally{
			closeAll(rs, ps, conn);
		}
		return vo;
	}

	@Override
	public MemberVO login(String id, String password) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberVO vo = null;
		
		try {
			conn = getConnection();
			String query = "SELECT id, password, name, address FROM member WHERE id=? AND password=?";
			ps = conn.prepareStatement(query);
			
			ps.setString(1, id);
			ps.setString(2,  password);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				vo=  new MemberVO(id, 
							      password, 
							      rs.getString("name"), 
							      rs.getString("address"));
			}
			
		}finally {
			closeAll(rs, ps, conn); //Pool?��?�� 꺼낸 Connection ?�� ?��?�� Pool�? 반환?��?��.
		}
		return vo;
	}
	@Override
	public void updateMember(MemberVO vo) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnection();
			
			String query = "UPDATE member SET password=? , name=?, address=? WHERE id=?";
			ps = conn.prepareStatement(query);
			
			ps.setString(1, vo.getPassword());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getAddress());
			ps.setString(4, vo.getId());
			
			System.out.println(ps.executeUpdate()+" �? ?��?��?��...");
		}finally {
			closeAll(ps, conn);
		}
		
	}	

//	public static void main(String[] args)throws Exception{
//		MemberDAOImpl dao=MemberDAOImpl.getInstance();
//		MemberVO VO=dao.findByIdMember("encore");
//		System.out.println(VO);
//		
//		ArrayList<MemberVO> list=dao.showAllMember();
//		System.out.println(list);
//		MemberVO vo=dao.login("encore", "playdata");
//		System.out.println(vo);
//	}
		
}





