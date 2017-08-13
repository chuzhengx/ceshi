package xiongcz.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SayHello extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		//在浏览器上打印内容
		out.print("<h1>hello everBody!!<h1>");
		//提取表单内容
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		
		out.println();
		out.println("I am "+name);
		out.println("you password is"+password);
		
		//在浏览器页面显示内容
	
		//储存cookie
		
		req.getCookies();
		
		
		Cookie Cname = new Cookie("name", name);
		Cookie Cname1 = new Cookie("uri", password);
		resp.addCookie(Cname);
		resp.addCookie(Cname1);
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
