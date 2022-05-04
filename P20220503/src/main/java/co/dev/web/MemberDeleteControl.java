package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberDeleteControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException { // 예외처리를 해야함.
		System.out.println("삭제처리하는 컨트롤입니다."); // 넘어오는 파라미터가 있어야함. 위에서 에러가 발생하면, 예외처리로 밑의 구문들을 발동시킴. 위에서 throws 하면 예외처리 안 해도 o 
		String id = request.getParameter("id");
		
		if(id.isEmpty()) {
			request.setAttribute("error", "모든 항목을 입력하세요!");
			request.getRequestDispatcher("memberView/memberDelete.jsp").forward(request, reponse);
			return;
		}
		
		MemberVO member = new MemberVO(); // 멤버변수에 아래의 요소들을 담기.
		member.setId(id);
		
		//update member 실행.
		MemberService service = new MemberService();
		service.memberDelete(member); 
		
		
		request.setAttribute("id", id);
		
		request.getRequestDispatcher("memberResult/memberDeleteOutput.jsp").forward(request, reponse);
	}

}
