package co.edu.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentList.json")
public class StudentListServ extends HttpServlet{

	@Override // db에서 읽어온 값을 루핑돌면서 밑의 형태로 만든다.
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 여러 건일 경우 배열 형태로
		// [{"studentNo": ?, "studentName": "?", "engScore": ?, "korScore": ?},{} ]
		StudentDAO dao = new StudentDAO();
		List<Student> list = dao.studentList();
		resp.setCharacterEncoding("UTF-8"); 
		resp.setContentType("text/plain;charset=UTF-8");
		String jsonString = "[";
		for (int i = 0; i < list.size(); i++) {
			jsonString += "{\"studentNo\": "+list.get(i).getStudentNo() //
					+", \"studentName\": \""+list.get(i).getStudentName()  //
					+ "\", \"engScore\": "+list.get(i).getEngScore() //
					+ ", \"korScore\": "+list.get(i).getKorScore() + "}";
			if(i != list.size()-1) {
				jsonString += ",";
			}
		}
		jsonString += "]";
		
		resp.getWriter().print(jsonString);
	}
	
}
