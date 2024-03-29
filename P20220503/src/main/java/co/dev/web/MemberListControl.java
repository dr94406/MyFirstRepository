package co.dev.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.dev.service.MerberService;
import co.dev.vo.MemberVO;

public class MemberListControl implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		MerberService service = new MerberService();
		List<MemberVO> list = service.memberList();

		request.setAttribute("all", list);

		request.getRequestDispatcher("memberResult/memberListOutput.tiles").forward(request, response);

	}

}
