package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MemberService;

public class MemberDeleteControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("삭제 작업");
		String id = req.getParameter("id");
		
		MemberService service = new MemberService();
		service.memberDelete(id);
		
		req.setAttribute("id", id);
		
		req.getRequestDispatcher("memberResult/memberDeleteOutput.jsp").forward(req, resp);
		
		
	}
	
}