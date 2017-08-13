package xiongcz.src.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class HelloFilter implements Filter {

	public void destroy() {
		System.out.println("do destroy...");
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("dofilter...");
		chain.doFilter(arg0, arg1);
	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("do init...");
		
	}

}
