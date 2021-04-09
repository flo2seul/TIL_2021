package filter;
/*
 * ?��?��?��?��?��로�??�� ?��?��?��?�� ?���??�� �?로채?��?��
 * ?��코딩 ?��?��?�� ?��?��링으�? ?��결한?��.
 * ?��?�� ?��?�� ?���?분에 ?��?��?�� 모든 컴포?��?��?��?? ?��기서 ?��?��?�� ?��?���? ?��?��?�� ?��과�?? ?��게된?��.
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
		//?��방향 ?���?처리
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//?��버상?�� ?��?�� 컴포?��?��?���? 계속 ?��?��링한 ?��?��?�� ?��결되?���? ?���? ?��?�� ?��?��...반드?�� ?��?��?�� ?��?��.
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}
}







