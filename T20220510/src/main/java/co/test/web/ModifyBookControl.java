package co.test.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.test.service.BookService;
import co.test.vo.BookVO;

public class ModifyBookControl implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bookCode = request.getParameter("bookCode");
	      String bookTitle = request.getParameter("bookTitle");
	      String bookAuthor = request.getParameter("bookAuthor");
	      String bookPress = request.getParameter("bookPress");
	      String bookPrice = request.getParameter("bookPrice");          
	      
	      if(bookCode.isEmpty() || bookTitle.isBlank() || bookAuthor.isBlank() || bookPress.isBlank() || bookPrice.isBlank()) {
	         request.setAttribute("error", "모든 항목을 입력하세요!");
	         request.getRequestDispatcher("memberView/memberUpdate.jsp").forward(request, response);
	         return;
	      }
	      
	      BookVO Book = new BookVO();
	      Book.setBookCode(bookCode);
	      Book.setBookTitle(bookTitle);
	      Book.setBookAuthor(bookAuthor);
	      Book.setBookPress(bookPress);
	      Book.setBookPrice(Integer.parseInt(bookPrice));
	      
	      BookService service = new BookService();
	      service.modifyBook(Book);

	      request.setAttribute("bookCode", bookCode);
	      
		request.getRequestDispatcher("result/modifyOutput.jsp").forward(request, response);
	}

}
