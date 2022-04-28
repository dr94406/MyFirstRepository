package co.edu.student;
 // 서블릿 연결하는 클래스페이지
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/addStudentServlet")
public class AddStudentServ extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8"); //한글 해석을 위한 utf8 인코딩
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		String studentNo = req.getParameter("sno");
		String studentName = req.getParameter("sname");
		String engScore = req.getParameter("eScore");
		String korScore = req.getParameter("kScore");
		
		Student stud = new Student();
		stud.setStudentNo(Integer.parseInt(studentNo)); // 문자열을 int타입으로 변동.
		stud.setStudentName(studentName);
		stud.setEngScore(Integer.parseInt(engScore));
		stud.setKorScore(Integer.parseInt(korScore));
		
		// 위에 작성한 4개의 파라메터를 받아서, db에 insert 작업을 실시.
		StudentDAO dao = new StudentDAO();
		boolean success = dao.addStudent(stud);
		if(success) {
			// 성공하면, {"retCode":"Success", "studNo": studentNo, "studName":"studentName","engScore":engScore, "KorScore":KorScore}
			resp.getWriter().println("{\"retCode\":\"Success\",\"studentNo\":"+studentNo+", \"studentName\":\""+studentName+"\",\"engScore\":"+engScore+", \"korScore\": "+korScore+"}");
		} else {
			// {retCode":"Fail"}
			resp.getWriter().println("{\"retCode\":\"Fail\"}");
		}
		
	}
}
