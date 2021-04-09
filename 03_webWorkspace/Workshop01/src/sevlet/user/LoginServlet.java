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
		// 1. 클라이언트 몸값을 받는다...

		//2. 받은 값을 다시 웹브라우저로 전송해서 출력
		request.setCharacterEncoding("UTF-8");//이 부분은 지금 적용이 안된다.
		response.setContentType("text/html;charset=UTF-8");//
		PrintWriter out=response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
	    out.println("<html><body><center><h3>");
	    out.println("<b>"+id  +" </b>님이 로그인 되었습니다!!!</h3><br>");
	    out.println("<a href='#'> 도서 등록</a><br/>");
	    out.println("<a href='#'> 로그 아웃</a> <br/></center></body></html>");
	    out.close();
	}

}
