package servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/MFS")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//������ ���⼭ �ۼ��Ѵ�.
		/*
		 * 1.�ѱ� ó��..����� ��δ�
		 * 2. PrintWriter ��ü ���� �޴´�.
		 * 3. ���� ���� ������ �� �޾ƿ´�.
		 * 4. Ŭ���̾�Ʈ�� �������� ���� ������ ����Ѵ�.
		 * 5. PrintWriter�� �ݾ��ش�.
		 */
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String[] menus = request.getParameterValues("menu");
		String gender = request.getParameter("gender");
		
		String intro = request.getParameter("intro");
		
		out.println("<html><body>");
		out.println("<h2>���� �Էµ� ���� ����մϴ�...</h2>");
		out.println("<li>����� ���̵�" +id+ "</li>");
		out.println("<li>����� �н�����"+password+"</li>");
		
		out.println("<strong>����� �����ϴ� ���� �޴���</strong><br>");
		String menu = "";
		for (int i=0; i<menus.length;i++) {
			menu += menus[i] + "";
		}
		out.println(menu);
		
		out.println("<br><strong>����� ������"+gender+"�Դϴ�.</strong><br>");
		
		out.println("<br><strong>�������翡 �������ּż� �����մϴ�.</strong><br>");
		out.println(intro);
		
		out.close();
		
		
	}
}
