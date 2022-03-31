package Book;

import java.io.Serializable;

public class Book implements Serializable {
	// 책번호(1,2,3), 책이름(홍길동), 장르 (소설).
	private int BookNo;
	private String BookName;
	private String BookGenre;

	// 생성자 : 기본생성자, 매개값이 4개 생성자.
	public Book() {

	}

	public Book(int bookNo, String bookName, String bookGenre) {
		super();
		this.BookNo = bookNo;
		this.BookName = bookName;
		this.BookGenre = bookGenre;
	}

	

	public int getBookNo() {
		return BookNo;
	}

	public void setBookNo(int bookNo) {
		BookNo = bookNo;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getBookGenre() {
		return BookGenre;
	}

	public void setBookGenre(String bookGenre) {
		BookGenre = bookGenre;
	}

	@Override
	public String toString() {
		return "책정보 [책번호=" + BookNo + ", 책이름=" + BookName + ", 책장르=" + BookGenre + "]";
	}
}
