package co.edu.servlet;
// jsonData 만들기.
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsonData.do")
public class JsonData extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8"); // 인코딩 해줘야한다
		resp.setContentType("text/plain;charset=UTF-8"); // 인코딩
		// [{"name":"김형민","age":23},{"name":"이형민","age":25},{"name":"김두한","age":30}] // 배열 안의 오브젝트 데이터 3개
		resp.getWriter().print("[{\"name\":\"김형민\",\"age\":23},{\"name\":\"이형민\",\"age\":25},{\"name\":\"김두한\",\"age\":30}]");

	}	// 위에 주석으로 만든 배열을 print("이 사이에 넣기")
}