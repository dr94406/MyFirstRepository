package co.edu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/StudentGetServlet") // 서블릿 이름, 어노테이션방식
public class StudentGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentGetServlet() {
		super();
	}

	// get방식으로 호출할 시 이 파라메터를 호출.
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// GET: cmd=search, cmd=null -> JSON 반환.
		response.setCharacterEncoding("utf-8");

		String cmd = request.getParameter("cmd"); // 파라메터가 값을 cmd로 넘김.

		// 한 건 조회.
		if (cmd != null && cmd.equals("search")) {
			String id = request.getParameter("user_id"); // hong이라는 값이 넘어감.
			StudentDAO dao = new StudentDAO();
			Student student = dao.searchStudent(id); // 인스턴스 값을 하나 넘겨줌.

			response.setContentType("text/html;charset=utf-8");
			if (student != null) {
				response.getWriter().println("<form action='StudentGetServlet' method='post'>");
				response.getWriter().println("<h3>학생번호: " + student.getStudentNo() + "</h3>");
				response.getWriter().println("<h3>학생이름: " + student.getStudentName() + "</h3>");
				response.getWriter().println("<h3>영어점수: <input type='number' name='eng_score' value=" + student.getEngScore() + "'></input></h3>");
				response.getWriter().println("<h3>국어점수: <input type='number' name='kor_score' value=" + student.getKorScore() + "'></input></h3>");
				response.getWriter().println("<input type='hidden' name='cmd' value='mod'>");
				response.getWriter().println("<input type='hidden' name='user_id' value=" +student.getStudentNo()+">");
				response.getWriter().println("<input type='hidden' name='user_name' value= " +student.getStudentName()+">");
				response.getWriter().println("<input type='submit' value='수정'>");
				response.getWriter().println("</form><br>");
			} else {
				response.getWriter().println("<h3>조회된 데이터가 없습니다.</h3>");
			}

			response.getWriter().println("<a href='studentList.jsp'>목록으로 이동</a>");

		} else if (cmd != null && cmd.equals("list")) {
			StudentDAO dao = new StudentDAO();
			Student stud = new Student();
			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");

			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);

			dao.addStudent(stud);

			response.getWriter().print("입력성공");
		} else {

			response.setContentType("text/json;charset=utf-8");
			StudentDAO dao = new StudentDAO();
			List<Student> list = dao.studentList();
			// [{}, {}, {}]
			Gson gson = new GsonBuilder().create(); // 제이슨 라이브러리로 편하게 데이터를 가져옴. 카톡에 파일있음.
			response.getWriter().print(gson.toJson(list));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 한글로 처리되게 인코딩.
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		// 한 건 추가기능.
		String cmd = request.getParameter("cmd");
		if (cmd != null && cmd.equals("add")) { // 입력.

			StudentDAO dao = new StudentDAO();
			Student stud = new Student();

			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String eng = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");

			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(eng));
			stud.setKorScore(Integer.parseInt(kor));

			dao.addStudent(stud);

			//response.getWriter().print("정상적으로 입력되었습니다.");

			// 한 건 삭제기능.
		} else if (cmd != null && cmd.equals("del")) {
			String id = request.getParameter("user_id"); // id값만 알면 삭제가능.

			StudentDAO dao = new StudentDAO();
			if (dao.removeStudent(id)) {
				response.getWriter().print("<script>alert('삭제 성공하였습니다.')</script>");
			} else {
				response.getWriter().print("<script>alert('삭제 실패하였습니다')</script>");
			}

			// 한 건 수정기능
		} else if (cmd != null && cmd.equals("mod")) {
			// 사용자 입력 파라메터 =>
			Student stud = new Student();

			String id = request.getParameter("user_id");
			String name = request.getParameter("user_name");
			String eng = request.getParameter("eng_score");
			String kor = request.getParameter("kor_score");

			stud.setStudentNo(Integer.parseInt(id));
			stud.setStudentName(name);
			stud.setEngScore(Integer.parseInt(eng));
			stud.setKorScore(Integer.parseInt(kor));
			
			StudentDAO dao = new StudentDAO();
			dao.modifyStudent(stud);
			
			//response.getWriter().print("정상적으로 수정되었습니다.");
		}
		response.sendRedirect("studentList.jsp");
	} // end of doPost()

} // end of class
