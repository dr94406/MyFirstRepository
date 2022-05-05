package co.edu;

// 샘플 서블릿, 이게 안 켜진다면 빌드패스에 톰캣이 있는지 확인해본다.
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/SampleServlet", "/sampleServlet" }) // 대소문자 구분없이 실행시키는 구문.
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SampleServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
