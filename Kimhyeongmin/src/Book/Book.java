package Book;


import java.io.Serializable;

public class Book implements Serializable {
	// 책번호(1,2,3), 책이름(홍길동), 장르 (소설).
	private int bookId; // 책 번호
	private String title; // 도서명
	private String author; // 작가명
	private String publisher; // 출판사
	private int price; // 가격
	private String rental; // 대여 ( Y,N으로 구분)
	

	// 생성자 : 기본생성자, 매개값이 4개 생성자.
	public Book() {

	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String getRental() {
		return rental;
	}
	
	public void setRental(String rental) {
		this.rental = rental;
	}
	
	
	public Book(int bookId, String title, String author, String publisher, int price, String rental) {
	      super();
	      this.bookId = bookId;
	      this.title = title;
	      this.author = author;
	      this.publisher = publisher;
	      this.price = price;      
	      this.rental = rental;
	   }


	   public Book(int bookId, String title, String author, String publisher, int price) {
	       this(bookId, title, author, publisher, price, "N");
	   }
	

	@Override
	public String toString() {
		System.out.println();
		return "Book [도서번호:" + bookId + ", 도서명:" + title + ", 작가명:" + author +
										  ", 출판사:" + publisher + ", 도서가격:" + price
										+ ",  대여정보:" + rental + "]";
	}

}