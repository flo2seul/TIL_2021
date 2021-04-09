package servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Redirect2")
public class RedirectServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RedirectServlet2() {
        
    }
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	/*
	 * checkbox�� �������� ������...error page�� �̵� --> Redirect ��� ���
	 * checkbox�� �����ߴٸ�...��� �������� �̵� --> Forward ��� �̿�
	 * 
	 */
	   String choose = req.getParameter("choose");
	   if(choose==null)
		   resp.sendRedirect("./error/error.html");
	   else
		   req.getRequestDispatcher("redirect2.jsp").forward(req, resp);
}
}
