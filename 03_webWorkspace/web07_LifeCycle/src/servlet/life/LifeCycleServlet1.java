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
    private int count = 0; //�ʵ�
    
    public LifeCycleServlet1() {
       System.out.println("1. LifeCycleServlet1 ������ ȣ��...by Container...");
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
		System.out.println("3. service()--> doGet() | doPost() ȣ��...by Container...");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		//Ŭ���̾�Ʈ�� ��û�� � ���Դ����� count�ϴ� ������ �ۼ�
		out.print("<html><body bgcolor='yellow'>");
		out.print("<h3>LifeCycle CallBack Method....</h3>");
		out.print("<b>count ::"+ ++count +"</b>" );
		out.print("</body></html>");
	}
	
	@Override
	public void init() throws ServletException {
		 System.out.println("2. init() ȣ��...by Container...");
	}
	@Override
	public void destroy() {
		System.out.println("4. destroy() ȣ��...by Container...");
	}

}
