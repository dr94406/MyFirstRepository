package Book;

// 오전에 한 것은 책의 정보를 기존의 소스파일 그대로 받아와서 제목만 변동한 것이다.
import java.io.Serializable;

public class Book implements Serializable {
	// 책번호(1,2,3), 책이름(홍길동), 장르 (소설).
	private int bookId; // 책 번호
	private String title; // 도서명
	private String writer; // 작가명
	private String publisher; // 출판사
	private int price; // 가격
	private String rental; // 대여 ( y,n으로 구분)

	public String getRental() {
		return rental;
	}

	public void setRental(String rental) {
		rental = rental;
	}

	// 생성자 : 기본생성자, 매개값이 4개 생성자.
	public Book() {

	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		price = price;
	}

	public Book(int bookId, String title, String writer, String publisher, int price, String rental) {
		super();
		bookId = bookId;
		title = title;
		writer = writer;
		publisher = publisher;
		price = price;
		rental = rental;
	}

	@Override
	public String toString() {
		System.out.println();
		return "Book [도서번호:" + bookId + ", 도서명:" + title + ", 작가명:" + writer +
										  ", 출판사:" + publisher + ", 도서가격:" + price
										+ ", 대여정보:" + "Rental]";
	}

}