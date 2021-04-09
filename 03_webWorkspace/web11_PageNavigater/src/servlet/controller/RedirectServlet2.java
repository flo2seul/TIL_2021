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
	 * checkbox를 선택하지 않으면...error page로 이동 --> Redirect 방법 사용
	 * checkbox를 선택했다면...결과 페이지로 이동 --> Forward 방법 이용
	 * 
	 */
	   String choose = req.getParameter("choose");
	   if(choose==null)
		   resp.sendRedirect("./error/error.html");
	   else
		   req.getRequestDispatcher("redirect2.jsp").forward(req, resp);
}
}
