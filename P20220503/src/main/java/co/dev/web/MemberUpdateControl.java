package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MerberService;
import co.dev.vo.MemberVO;

public class MemberUpdateControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub 넘어오는 파라미터.
		String id = "q";
		String name = "q";
		String passwd = "q";
		String email = "q ";

		if (id.isEmpty() || name.isBlank() || passwd.isBlank() || email.isBlank()) {
			request.setAttribute("error", "모든 항목을 입력하세요!");
			request.getRequestDispatcher("memberView/memberUpdate.jsp").forward(request, response);
			return;
		}

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setName(name);
		member.setEmail(email);
		member.setPasswd(passwd);

		MerberService service = new MerberService();
		service.memberUpdate(member);
		
		request.setAttribute("id", id);
		
		request.getRequestDispatcher("memberResult/memberUpdateOutput.jsp").forward(request, response);
	}

}
