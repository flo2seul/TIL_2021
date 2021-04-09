package jdbc.step1.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 디비 Access 하기 위한 4단계 작업을 작성하는 로직..
 * 1.디비서버에 대한 파편적인 정보들(서버 실제값)을 상수로 지정
 */
public class JDBC4StepTest {
	public static String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static String URL = "jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8";
	public static String USER = "root";
	public static String PASSWORD = "1234";

	public JDBC4StepTest() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER);
		System.out.println("1.드라이버 로딩 성공...");
		
		Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("2. 디비 연결 성공...");
				
		String query = "insert into mytable(num, name, address) values(?,?,?)";
		PreparedStatement ps=conn.prepareStatement(query);
		System.out.println("3. PreparedStatement 생성...");
		
		ps.setInt(1, 333);
		ps.setString(2, "박나래");
		ps.setString(3, "여의도");
		
		String querydel = "DELETE FROM mytable WHERE num=?";
		PreparedStatement ps1=conn.prepareStatement(querydel);
		System.out.println("3. Preparedstatement 생성...");
		
		ps.setInt(1, 333);
		System.out.println(ps1.executeUpdate()+"row delete....ok");
		
		
		//업데이트문 실행....111인 사람의 이름과 주소를 변경
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		new JDBC4StepTest();

	}

}
