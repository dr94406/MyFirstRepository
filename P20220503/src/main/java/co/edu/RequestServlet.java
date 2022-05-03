package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestservlet.do")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RequestServlet() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() call."); // 서버 실행 후 최초로 한 번만 콜이 온다.
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service() call."); // 서버접속 최초 요청이 아닐 시 서비스만 콜이온다.
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter(); // 출력스트림 생성.
		out.print("<h3>김형민</h3>"); // 이렇게 입력 시 출력, 응답정보에 김형민이라는 정보가 실려서 요청하는 웹페이지에 띄워줌.
		out.print("<h3>네트워크정보</h3>");

		// 요청정보에 포함되어 있던 정보들의 리스트.
		out.print("Request Scheme: " + request.getScheme() + "<br>"); // 스키마 정보 읽어오기
		out.print("Server Name: " + request.getServerName() + "<br>"); // 서버네임 정보 읽어오기. 아이피지정 안 했으니 localhost로 보인다.
		out.print("Server Address: " + request.getLocalAddr() + "<br>"); // 동일
		out.print("Cliend Address: " + request.getRemoteAddr() + "<br>"); // 클라이언트 어드레스
		out.print("Client Port: " + request.getRemotePort() + "<br>"); // 리모트포트가 보인다.
		
		//요청 프로토콜 페이지 정보 리스트.
		out.print("<h3>요청 프로토콜</h3>");
		out.print("Request URI: " + request.getRequestURI() + "<br>");
		out.print("Request URL: " + request.getRequestURL() + "<br>");
		out.print("Context path: " + request.getContextPath() + "<br>");
		out.print("Request protocol: " + request.getProtocol() + "<br>");
		out.print("Server Path: " + request.getServletPath() + "<br>");

		// 넘긴 파라메터 정보
		out.print("queryString: " + request.getQueryString() + "<br>");
		// id=user1&passwd=1234&username=Hong 이런유형으로 입력시, get 방식으로 넘어온다.
		out.print("id: " + request.getParameter("id")+ "<br>");
		out.print("pawd: " + request.getParameter("passwd")+ "<br>");
		out.print("name: " + request.getParameter("username")+ "<br>");
		// 위에 get방식으로 넘어간 정보들을 출력. 쿼리스트링
		
		// out 닫기.
		out.close();
	}

}
