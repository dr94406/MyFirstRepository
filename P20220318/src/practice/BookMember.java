package practice;

// 상속은 필수적으로 해야한다. 겟셋->유징필드->투스트링 
// 도서반의 반장이름.
// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 
public class BookMember extends Member { // 상속을 해주겠습니다. Member에게서.
	private String BookName;
	private String BookClass;
	public BookMember(int id, String bookName, String bookClass) {
		super();
		this.BookName = bookName;
		this.BookClass = bookClass;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookClass() {
		return BookClass;
	}
	public void setBookClass(String bookClass) {
		BookClass = bookClass;
	}
	@Override
	public String toString() {
		return "BookMember [BookName=" + BookName + ", BookClass=" + BookClass + ", getMemberId()=" + getMemberId()
				+ ", getMemberName()=" + getMemberName() + ", getPhone()=" + getPhone() + "]";
	}
}
