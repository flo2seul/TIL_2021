package servlet.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.Member;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Member> list;
	private ServletContext cont;
	
 

	@Override
	public void init() throws ServletException {
		cont = getServletContext(); 
		
		String filename = cont.getInitParameter("path");
		BufferedReader br = null;
		InputStream is = null;
		try {
			list = new ArrayList<Member> ();
			is = cont.getResourceAsStream(filename);
			// = new BufferedReder(new InputStreamReader(is));
			String line=null;
			while ((line = br.readLine()) !=null) {
				String[] inputs = line.split("//|");
				//list.add(new Member(inputs[0],inputs[1]));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		
		/*
		 * 1. ���� �޾Ƽ�
		 * 2. ���� ������ vo��ü ����
		 * 3. ServletContext���� �޾Ƽ� vo��ü�� ���ε�
		 * 4.������ �̵�...�� ������ϱ� a�±׷� �̵�
		 * 
		 */
		//1.
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
	    String address = request.getParameter("address");
	    
	    //2.
	    Member vo = new Member(id,password,name, address);
	   
	    //�ؽ�Ʈ ���Ͼȿ� id�� ���ϱ�(for��)
	   
         //userList = (HashMap)cont.getAttribute("userList");
		
	    //3. if��
		
	    
	    cont.setAttribute("vo", vo);
	    
	    //4.
	    out.println("<html><body>");
	    out.println("<hr>");
	    out.println("<h3>"+id+"���� ȸ������ �Ǿ����ϴ�!!!!!</h3>");
	    out.println("<a href=Success.jsp>�α��� �ϱ�</a>");
	    out.println("<a href=register.html>Ȩ����</a>");
	    out.println("</body></html>");
	    out.close();
	    
	
	}
}