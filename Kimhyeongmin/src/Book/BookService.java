package Book;

import java.util.List;

public interface BookService { // 인터페이스 (메뉴정보창)

	public void insertBook(Book book); // 입력.

	public Book getBook(int aoa); // 번호로 한건조회.

	public List<Book> bookList(); // 전체목록.

	public void modifyBook(Book book); // 한건수정.

	public void removeBook(int glo); // 한건삭제.

	public List<Book> searchBook(String name); // 이름조회.

	public void rentalBook(Book book); // 도서대여
	
	
	public void saveToFile();

}