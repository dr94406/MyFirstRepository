package co.dev.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.dev.service.MerberService;
import co.dev.vo.MemberVO;

public class MemberListJson implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/json;charset=UTF-8");

		MerberService service = new MerberService();
		List<MemberVO> list = service.memberList();

		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(list));

	}

}
