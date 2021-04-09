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
		//로직은 여기서 작성한다.
		/*
		 * 1.한글 처리..양방향 모두다
		 * 2. PrintWriter 객체 리턴 받는다.
		 * 3. 각각 폼의 값들을 다 받아온다.
		 * 4. 클라이언트의 브라우저로 받은 내용을 출력한다.
		 * 5. PrintWriter를 닫아준다.
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
		out.println("<h2>폼에 입력된 값을 출력합니다...</h2>");
		out.println("<li>당신의 아이디" +id+ "</li>");
		out.println("<li>당신의 패스워드"+password+"</li>");
		
		out.println("<strong>당신이 좋아하는 점심 메뉴는</strong><br>");
		String menu = "";
		for (int i=0; i<menus.length;i++) {
			menu += menus[i] + "";
		}
		out.println(menu);
		
		out.println("<br><strong>당신의 성별은"+gender+"입니다.</strong><br>");
		
		out.println("<br><strong>설문조사에 참여해주셔서 감사합니다.</strong><br>");
		out.println(intro);
		
		out.close();
		
		
	}
}
