package servlet.life;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet1
 */
@WebServlet("/LIFE1")
public class LifeCycleServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int count = 0; //필드
    
    public LifeCycleServlet1() {
       System.out.println("1. LifeCycleServlet1 생성자 호출...by Container...");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		System.out.println("3. service()--> doGet() | doPost() 호출...by Container...");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		//클라이언트의 요청이 몇본 들어왔는지룰 count하는 로직울 작성
		out.print("<html><body bgcolor='yellow'>");
		out.print("<h3>LifeCycle CallBack Method....</h3>");
		out.print("<b>count ::"+ ++count +"</b>" );
		out.print("</body></html>");
	}
	
	@Override
	public void init() throws ServletException {
		 System.out.println("2. init() 호출...by Container...");
	}
	@Override
	public void destroy() {
		System.out.println("4. destroy() 호출...by Container...");
	}

}
