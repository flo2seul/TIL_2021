package servlet.header;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrintHeaderServlet
 */
@WebServlet("/PHP")
public class PrintHeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrintHeaderServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doProcess(request,response);

	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ������ ���⼭ �ۼ��Ѵ�.
		/*
		 * 1.�ѱ� ó��..����� ��δ� 
		 * 2. PrintWriter ��ü ���� �޴´�. 
		 * 3. ���� ���� ������ �� �޾ƿ´�. 
		 * 4. Ŭ���̾�Ʈ�� �������� ���� ������ ����Ѵ�. 
		 * 5. PrintWriter�� �ݾ��ش�.
		 */
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//1. ���� �Էµ� �� �޾Ƽ�...get������� �Ѿ�� �����͵� �������Ϳ� ������ ������� �޴´�.
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String n = request.getParameter("n");
		String  address = request.getParameter("address");
		
        //2. header�� ������ �� �޾ƿ´�.
		out.println("<html><body>");
		out.println("<strong>=====Header Information Printed....=====</strong><br>");
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String name = (String) headerNames.nextElement();
			String value = request.getHeader(name);
			out.println(name + ":" + value + "<br>");
		}
		out.println("<hr>");
		out.println("<br><strong>"+n+","+id+","+address+","+password+"</strong></br>");
		out.println("</body></html>");
		out.close();
	}

}
