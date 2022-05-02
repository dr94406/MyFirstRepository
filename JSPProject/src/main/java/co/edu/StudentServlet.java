package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet 매핑 IOC : Introversion of control 개발자가 아닌, http라는 컨테이너가 제어함. 
public class StudentServlet extends HttpServlet { // http라는 클래스 상속. 요청정보, 응답정보가 가지고있는 http 방식으로 페이지를 요청받고, 처리된 결과를 보여줌. 
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("inin() 호출."); // init 메소드 호출. 제일 처음 한 번만 호출.
	}
	
	@Override
	// 서비스 메소드 실행.
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");

		String method = req.getMethod(); // return type이 string이다.
		PrintWriter out = resp.getWriter(); // 출력 스트림 생성 [응답정보를 보여주는 웹페이지에 스트림을 생성.]
		out.print("<h3>Student Sample page.</h3>");
	
		if (method.equals("GET")) {
			out.print("<h3>Get방식 호출</h3>");
			doGet(req, resp);
		} else if (method.equals("POST")) {
			out.print("<h3>Post방식 호출</h3>");
			
		}
		out.print("<a href='../index.jsp?user_name=kildong&user_id=hong'>index page</a>"); // 파라메터로 넘겨줄 때는 ?을 사용, 값을 두 개 가져옴.공백 들어가면 안됨.
	}

	// get 방식이면 doGet 실행.
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	
	@Override
	//디스트로이 호출 (서버 끄면 보임)
	public void destroy() {
		System.out.println("destroy() 호출."); // destroy 호출.
	}
}
