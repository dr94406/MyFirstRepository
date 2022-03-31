package Book;
// 오전에 한 것은 책의 정보를 기존의 소스파일 그대로 받아와서 제목만 변동한 것이다.
import java.io.Serializable;

public class Book implements Serializable {
	// 책번호(1,2,3), 책이름(홍길동), 장르 (소설).
	private int BookId;
	private String Title;
	private String Writer;
	private String Publisher;
	private int Price;
	
	// 생성자 : 기본생성자, 매개값이 4개 생성자.
	public Book() {

	}
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public Book(int bookId, String title, String writer, String publisher, int price) {
		super();
		BookId = bookId;
		Title = title;
		Writer = writer;
		Publisher = publisher;
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [책 번호=" + BookId + ", 제목=" + Title + ", 저자=" + Writer + ", 출판사=" + Publisher
				+ ", 책 가격=" + Price + "]";
	}
	
}