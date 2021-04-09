package servlet.life;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 
 * Ŭ���̾�Ʈ�� ��û�� ó���� ���
 * �� �ʵ忡 ������ COUNT���� ������ ������� �ʰ�
 * ������ jsp���� �ѱ��
 * �̶�
 * ������ �������� ����ؾ��ϳ�
 * �ܼ��ϰ� �츮�� �̹� �˰� �ִ� ����� a�±�(href �Ӽ��� jsp�������� ����)�� �̿�����
 */
@WebServlet("/LIFE2")
public class LifeCycleServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int count = 0; //�ʵ�
    
    public LifeCycleServlet2() {
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
		
		//�� �κ��� ������ jsp�� ���� ���� ���� �д㿡 �� �´�.
		/*out.print("<html><body bgcolor='yellow'>");
		out.print("<h3>LifeCycle CallBack Method....</h3>");
		out.print("<b>count ::"+ ++count +"</b>" );
		out.print("</body></html>");
		*/
		out.println("<a href=life2.jsp?cnt="+count+">���⸦ Ŭ���Ͻø� JSP�������� �̵��մϴ�.</a>");
		out.close();
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
