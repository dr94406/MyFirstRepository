package practice;

// 상속은 필수적으로 해야한다. 겟셋->유징필드->투스트링 
// 도서반의 반장이름.
// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 
public class BookMember extends Member { // 상속을 해주겠습니다. Member에게서.
	private String BookName;
	private String BookClass;
	
	
	public BookMember(int memberId, String memberName, String phone, String stuName, String stuClass) {
		super(memberId, memberName, phone);
		this.BookName = stuName;
		this.BookClass = stuClass;
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
		return " [책의 이름은 =" + BookName + ", 강의실의 정보는 =" + BookClass + ", 회원의 아이디는 =" + getMemberId()
				+ ", 회원의 이름은 =" + getMemberName() + ", 회원의 휴대전화 번호는 =" + getPhone() + "]";
	}
}
