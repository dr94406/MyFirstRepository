package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
@WebServlet("/FileUploadServlet")
public class FileUploadServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FileUploadServ() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String title = request.getParameter("title");
		String content = request.getParameter("content");
		System.out.println("title: " + title + ", content: " + content);
		
		String saveDir = "upload";
		 
		saveDir = getServletContext().getRealPath(saveDir);
		int maxSize = 1024 * 1024 * 10;
		String encoding = "UTF-8";
		// multipart 요청.
		// request, 저장위치, 최대사이즈, 인코딩방식, 리네임정책 5가지가 필요.
		// 리네임 정책이란? 서버에 파일을 올렸는데, 똑같은 파일이 있으면 구분을 위해 다른 이름을 지정하는 것.
		MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy()); // 파일업로드를 위한 배열 선언 
		title = multi.getParameter("title");
		content = multi.getParameter("content");
		String profile = multi.getOriginalFileName("profile");
		String Filename = multi.getOriginalFileName("profile");
		System.out.println("title: " + title + ", content1: " + content + ", profile");
	}

}
