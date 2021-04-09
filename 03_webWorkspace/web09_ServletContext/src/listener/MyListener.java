package listener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletContext;
/*
 * WAS?— ?˜?•´?„œ ?˜¸ì¶œë˜?Š” ëª¨ë“  ?¼?´?”„ ?‚¬?´?´ ë©”ì†Œ?“œ ? •ë¦?...
 * 1. contextInitialized()
 * --------------------Ready On------------------------------
 * 2. ?„œë¸”ë¦¿ ?ƒ?„±? ?˜¸ì¶?
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
	   
	   //1. ServletContextë¦¬í„´ ë°›ìŒ...?´?•Œ sceë¡œë??„° ë°›ì•„?•¼ ?•œ?‹¤.
	   cont = sce.getServletContext();
	   
	   //2. DD?ŒŒ?¼?˜ ê²½ë¡œë¥? ?½?–´?“¤?¸?‹¤.
	   String filename = cont.getInitParameter("path");
	   System.out.println("User File Path : "+filename);
	   
	   //3. getResourceAsStream()...
	   InputStream is = null;
	   BufferedReader br = null;
	   try {
		   System.out.println("getResourceAsStream()....");
		   is = cont.getResourceAsStream(filename);
		   
		   System.out.println("BufferedReader ?ƒ?„±...");
		   br = new BufferedReader(new InputStreamReader(is));
		   
		   String line = null;
		   System.out.println("?‚´?š©?„ ?½?–´?“¤?…?‹ˆ?‹¤...");
		   while((line = br.readLine())!=null) {
			   System.out.println(line);
		   }
	   }catch(Exception e) {
		   System.out.println("?ŒŒ?¼?„ ?½?–´?“¤?´?Š”?° ?‹¤?Œ¨?–ˆ?Šµ?‹ˆ?‹¤...");
	   }
	  }
	
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("contextDestroyed.....");
    }   	
}













