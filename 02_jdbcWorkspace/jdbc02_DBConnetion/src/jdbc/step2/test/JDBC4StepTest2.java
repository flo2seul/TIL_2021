package jdbc.step2.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.ServerInfo;

/*
 * 디비 Access 하기 위한 4단계 작업을 작성하는 로직..
 * 1.디비서버에 대한 파편적인 정보들(서버 실제값)을 상수로 지정
 * --->
 * 문제점 
 * 소스코드에서 서버정보가 그대로 노출되어져 있다.
 * 메타데이터화 시키자
 * ::
 * 해결책
 * 2.상수값과 추상메소드를 구성요소로 가지는 인터페이스를 별도의 모듈로 생성하고
 *  그 안에 서버 정보를 메타데이터화 시키겠다.
 *  ---->
 *  
 *  3. 자바 진영에서 가장 많이 사용하는 MetaData는 properties파일이다.
 *  key - value값을 모두 스트림으로 저장할 수 있다는 특성에 착안되어져
 */
public class JDBC4StepTest2 {

	public JDBC4StepTest2() throws ClassNotFoundException, SQLException {
		Class.forName(ServerInfo.DRIVER);
		System.out.println("1.드라이버 로딩 성공...");

		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
		System.out.println("2. 디비 연결 성공...");

		String query = "insert into mytable(num, name, address) values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(query);
		System.out.println("3. PreparedStatement 생성...");

		ps.setInt(1, 333);
		ps.setString(2, "박나래");
		ps.setString(3, "여의도");

		String querydel = "DELETE FROM mytable WHERE num=?";
		PreparedStatement ps1 = conn.prepareStatement(querydel);
		System.out.println("3. Preparedstatement 생성...");

		ps.setInt(1, 333);
		System.out.println(ps1.executeUpdate() + "row delete....ok");

		// 업데이트문 실행....111인 사람의 이름과 주소를 변경

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new JDBC4StepTest2();

	}

	static {
		// 1. properties파일의 내용을 로드해온다.
		try {

			Properties p = new Properties();
			p.load(new FileInputStream("src/config/db.properties"));
			
			String
		} catch (Exceptione e) {

		}

	}

}
