package co.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edu/default.do")
public class MYInfo extends HttpServlet {

	@Override // 상속 받아야지만 service + ctl+space로 실행
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain;charset=UTF-8");
		// content type => default.
		
		PrintWriter out = resp.getWriter();
		out.print("<h3>컨테트 타입이 기본</h3>");
	}
}
