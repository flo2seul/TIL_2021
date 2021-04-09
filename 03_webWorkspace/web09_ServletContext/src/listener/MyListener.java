package listener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;
/*
 * WAS?�� ?��?��?�� ?��출되?�� 모든 ?��?��?�� ?��?��?�� 메소?�� ?���?...
 * 1. contextInitialized()
 * --------------------Ready On------------------------------
 * 2. ?��블릿 ?��?��?�� ?���?
 * 3. init()
 * 
 * ---------------- Repeat---------------------------------- 
 * 
 * 4. service() --> doGet() | doPost()
 * 
 * ---------------------------------------------------------
 * 
 * 5. destroy()
 * 6. contextDestroyed()
 * 
 */
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {
	private ServletContext cont;
	
	
	public void contextInitialized(ServletContextEvent sce)  { 
	   System.out.println("contextInitialized.....");
	   
	   //1. ServletContext리턴 받음...?��?�� sce로�??�� 받아?�� ?��?��.
	   cont = sce.getServletContext();
	   
	   //2. DD?��?��?�� 경로�? ?��?��?��?��?��.
	   String filename = cont.getInitParameter("path");
	   System.out.println("User File Path : "+filename);
	   
	   //3. getResourceAsStream()...
	   InputStream is = null;
	   BufferedReader br = null;
	   try {
		   System.out.println("getResourceAsStream()....");
		   is = cont.getResourceAsStream(filename);
		   
		   System.out.println("BufferedReader ?��?��...");
		   br = new BufferedReader(new InputStreamReader(is));
		   
		   String line = null;
		   System.out.println("?��?��?�� ?��?��?��?��?��?��...");
		   while((line = br.readLine())!=null) {
			   System.out.println(line);
		   }
	   }catch(Exception e) {
		   System.out.println("?��?��?�� ?��?��?��?��?��?�� ?��?��?��?��?��?��...");
	   }
	  }
	
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("contextDestroyed.....");
    }   	
}













