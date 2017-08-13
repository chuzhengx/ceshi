package xiongcz.src;

import java.io.File;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Download extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("application/x-msdownload");
		
		String filepath = "D:\\test";
		String filename = req.getParameter("filename"); 
		resp.setHeader("Content-Disposition","attachment;filename=\""+filename+"\"");
		File f = new File(filepath,filename);
		FileImageInputStream fin = new FileImageInputStream(f);
		ServletOutputStream os = resp.getOutputStream();
		byte[] b = new byte[1024];
		int n;
		while((n = fin.read(b))!=-1){
			os.write(b, 0, n);
		}
		os.close();
		fin.close();
	}

}
