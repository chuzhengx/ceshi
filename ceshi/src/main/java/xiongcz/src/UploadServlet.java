package xiongcz.src;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String UPLOAD_DIRECTORY = "upload";
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//检测是否为流表单
		Boolean isMultipart = ServletFileUpload.isMultipartContent(req);
		
		if(isMultipart){
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			//factory.setRepository(new File("D:\\test"));
			
			List<FileItem> fileItems = null;
			try {
				fileItems = upload.parseRequest(req);
			} catch (FileUploadException e) {
				e.printStackTrace();
			}
			
			if(fileItems!=null){
				Iterator  iterator = fileItems.iterator();
				while(iterator.hasNext()){
					
					FileItem item = (FileItem) iterator.next();
					System.out.println(item);
					if(item.isFormField()){
						System.out.println("this is a form field"+item.getFieldName());
					}else{
						System.out.println("this is a uploaded file"+item.getName());
						try {
							File f = new File(item.getName());
							File sf = new File("D:\\test",f.getName());
							System.out.println("sf:"+sf);
							System.out.println("f:"+f);
							item.write(sf);
							resp.sendRedirect("uploadsuccess.jsp");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
			
			
			
		}

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
