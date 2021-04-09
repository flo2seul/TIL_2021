package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

/**
 * Servlet implementation class RegisterMember
 */
@WebServlet("/RMS")
public class RegisterMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    
    public RegisterMember() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 //로직은 여기 작성
		/*
		 * 1.폼값 받아서
		 * 2. vo 생성
		 * 3. DAO 리턴 받아서
		 * 4. 비즈니스 로직 호출
		 * 5. 결과값...바인딩(Attributie 잘 선택)
		 * 6. 네비게이션
		 * --> Controller 역할
		 */
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		//2. 
		MemberVO pvo = new MemberVO(id,password,name,address);
		
		//3,4,(5),6
		try {
			MemberDAOImpl.getInstance().registerMember(pvo);
			
			request.getRequestDispatcher("AllMember").forward(request, response);
			response.sendRedirect("AllMember");
		} catch (SQLException e) {
			
		}
	}

}
