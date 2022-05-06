package co.dev.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet { // 모든 콘트롤러를 요청하는 작업들은, 이 클래스를 거쳐서 가도록.
	HashMap<String, Control> list = null;
	String charset = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		charset = config.getInitParameter("charset");
		list = new HashMap<String, Control>();
		list.put("/memberInsert.do", new MemberInsertControl()); // insert control 구현클래스.
		list.put("/memberUpdate.do", new MemberUpdateControl()); // update control 구현클래스.
		list.put("/memberList.do", new MemberListControl());
		list.put("/memberSearch.do", new MemberSearchControl());
		list.put("/memberDelete.do", new MemberDeleteControl());
		
		// json 관련 등록
		list.put("/memberListJson.do", new MemberListJson());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String url = req.getRequestURI(); // / P20220503/memberInsert.do (사용자 uri)
		String context = req.getContextPath();
		String path = url.substring(context.length()); // P20220503/memberInsert.do  중 P20220503 뒤의 값을 들고옴.
		
		Control exeCon = list.get(path); // 실행시 위의 구현클래스들이 옴.
		exeCon.execute(req, resp); // 주소표시줄 url로 구분.
		
	}
}
