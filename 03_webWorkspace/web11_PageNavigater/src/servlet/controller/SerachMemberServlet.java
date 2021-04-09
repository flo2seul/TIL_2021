package servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SerachMemberServlet
 */
@WebServlet("/SMS")
public class SerachMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SerachMemberServlet() {
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * 1. ���� �޾Ƽ�
		 * 2. dao ���� �ް�
		 * 3. ����Ͻ� ���� ȣ���� ����� vo��ü ���� �ް�
		 * 4. ���Ϲ��� ���� Attribute�� ���ε�...� Attribute�� ����� ���� �� �����Ѵ�.
		 * 5. �׺���̼� --- ���� ���� �ִ� jsp�� �ٷ� �̵� 
		 */
    	//1.
        String id = request.getParameter("id");
    	
    	//2.
    	
        //3. request�� ���ε�...
    	request.setAttribute("id", id);
    	
    	//4.
    	request.getRequestDispatcher("result_view.jsp").forward(request, response);

}
}