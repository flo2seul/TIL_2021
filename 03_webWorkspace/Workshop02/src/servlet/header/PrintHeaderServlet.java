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
		// 로직은 여기서 작성한다.
		/*
		 * 1.한글 처리..양방향 모두다 
		 * 2. PrintWriter 객체 리턴 받는다. 
		 * 3. 각각 폼의 값들을 다 받아온다. 
		 * 4. 클라이언트의 브라우저로 받은 내용을 출력한다. 
		 * 5. PrintWriter를 닫아준다.
		 */
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//1. 폼에 입력된 값 받아서...get방식으로 넘어온 데이터도 폼데이터와 동일한 방식으로 받는다.
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String n = request.getParameter("n");
		String  address = request.getParameter("address");
		
        //2. header의 정보를 다 받아온다.
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
