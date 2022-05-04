package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberSearchControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String job = request.getParameter("job");

		String path = "";
		if (job.equals("search")) {
			 path = "memberView/memberSearch.jsp";
		} else if (job.equals("update")) {
			 path = "memberView/memberUpdate.jsp";
		} else if (job.equals("delete")) {
			 path = "memberView/memberDelete.jsp";
		}

		if (id.isEmpty()) { // id값이 없다면, 밑의 Attiribute의 문장을 실행.
			request.setAttribute("error", "아이디를 입력하세요.");
			request.getRequestDispatcher(path).forward(request, reponse);
			return;
		}
		
		MemberService service = new MemberService();
		MemberVO member = service.memberSearch(id);
		
		if(member == null) {
			request.setAttribute("result", "조회된 정보가 없습니다.");
		}
		request.setAttribute("member", member);
		
		if(job.equals("search")) {
			path = "memberResult/memberSearchOutput.jsp";
		}
		request.getRequestDispatcher(path).forward(request, reponse);
		
	}
	
}
