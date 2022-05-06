package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberInsertControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		// multipart : request, saveDir, maxSize, encoding, rename이 필요함.
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
		String pf = multi.getFilesystemName("profile");

		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setName(nm);
		vo.setEmail(em);
		vo.setPw(ps);
		vo.setProfile(pf);
		
		MemberService service = new MemberService();
		service.memberInsert(vo);

		request.setAttribute("id", id);
		request.setAttribute("name", nm);

		// Dispatcher 객체 forward.
		request.getRequestDispatcher("memberResult/memberInsertOutput.jsp").forward(request, reponse); // throw로
																										// memberinsert를
																										// 호출하는 곳으로 책임전가
	}

}
