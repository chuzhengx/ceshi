package xiongcz.src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import xiongcz.src.db.DBHelper;
import xiongcz.src.entiy.User;

public class JDBCServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		List<User> users = new ArrayList<User>();
		DBHelper helper = new DBHelper();
		helper.getConnection();
		users = helper.queryAll();
		session.setAttribute("users", users);
		req.getRequestDispatcher("test.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
