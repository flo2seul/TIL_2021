package filter;
/*
 * ?´?¼?´?–¸?Š¸ë¡œë??„° ?“¤?–´?˜¤?Š” ?š”ì²??„ ê°?ë¡œì±„?–´?„œ
 * ?¸ì½”ë”© ?‘?—…?„ ?•„?„°ë§ìœ¼ë¡? ?—°ê²°í•œ?‹¤.
 * ?´?›„ ?•„?„° ?’·ë¶?ë¶„ì— ?‚˜?˜¤?Š” ëª¨ë“  ì»´í¬?„Œ?Š¸?“¤?? ?—¬ê¸°ì„œ ?‘?—…?•œ ?•„?„°ë§? ?‘?—…?˜ ?š¨ê³¼ë?? ?–»ê²Œëœ?‹¤.
 */
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(value= {"/*"})
	public class EncodingFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//?–‘ë°©í–¥ ?•œê¸?ì²˜ë¦¬
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//?„œë²„ìƒ?˜ ?‹¤?Œ ì»´í¬?„Œ?Š¸?—ê²? ê³„ì† ?•„?„°ë§í•œ ?‘?—…?´ ?—°ê²°ë˜?„ë¡? ?•˜ê¸? ?œ„?•œ ?‘?—…...ë°˜ë“œ?‹œ ?ˆ?–´?•¼ ?•œ?‹¤.
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}
}







