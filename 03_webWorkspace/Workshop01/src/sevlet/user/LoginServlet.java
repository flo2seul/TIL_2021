package sevlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Ŭ���̾�Ʈ ������ �޴´�...

		//2. ���� ���� �ٽ� ���������� �����ؼ� ���
		request.setCharacterEncoding("UTF-8");//�� �κ��� ���� ������ �ȵȴ�.
		response.setContentType("text/html;charset=UTF-8");//
		PrintWriter out=response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
	    out.println("<html><body><center><h3>");
	    out.println("<b>"+id  +" </b>���� �α��� �Ǿ����ϴ�!!!</h3><br>");
	    out.println("<a href='#'> ���� ���</a><br/>");
	    out.println("<a href='#'> �α� �ƿ�</a> <br/></center></body></html>");
	    out.close();
	}

}
