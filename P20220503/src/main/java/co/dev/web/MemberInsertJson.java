package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberInsertJson implements Control {
	MemberVO vo = new MemberVO();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/json;charset=utf8");
		
		boolean isMulti = ServletFileUpload.isMultipartContent(request);
		
		if(isMulti) { // 멀티파트 요청입니다.
			String saveDir = "upload";
			 
			saveDir = request.getServletContext().getRealPath(saveDir);
			int maxSize = 1024 * 1024 * 10;
			String encoding = "UTF-8";
			// multipart 요청.
			// request, 저장위치, 최대사이즈, 인코딩방식, 리네임정책 5가지가 필요.
			// 리네임 정책이란? 서버에 파일을 올렸는데, 똑같은 파일이 있으면 구분을 위해 다른 이름을 지정하는 것.
			MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy()); // 파일업로드를 위한 배열 선언 

			String id = multi.getParameter("id");
			String ps = multi.getParameter("pw");
			String nm = multi.getParameter("name");
			String em = multi.getParameter("email");

			vo = new MemberVO();
			vo.setId(id);
			vo.setName(nm);
			vo.setEmail(em);
			vo.setPw(ps);
			
			MemberService service = new MemberService();
			service.memberInsert(vo);
			
			
		} else { // key =value&key1=value1.. 이런 형식이냐 
			String id = request.getParameter("id");
			String ps = request.getParameter("pw");
			String nm = request.getParameter("name");
			String em = request.getParameter("email");
			
			vo = new MemberVO();
			vo.setId(id);
			vo.setName(nm);
			vo.setEmail(em);
			vo.setPw(ps);

			MemberService service = new MemberService();
			service.memberInsert(vo);
		}
		// json 형태의 결과 반환
					Gson gson = new GsonBuilder().create();
					response.getWriter().print(gson.toJson(vo));
		
	}

}
