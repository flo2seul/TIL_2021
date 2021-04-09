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
		
	 //������ ���� �ۼ�
		/*
		 * 1.���� �޾Ƽ�
		 * 2. vo ����
		 * 3. DAO ���� �޾Ƽ�
		 * 4. ����Ͻ� ���� ȣ��
		 * 5. �����...���ε�(Attributie �� ����)
		 * 6. �׺���̼�
		 * --> Controller ����
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
