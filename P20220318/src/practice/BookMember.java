package practice;

// 상속은 필수적으로 해야한다. 겟셋->유징필드->투스트링 inhe
public class BookMember extends Member {
	private String stuName;
	private String stuClass;

	public BookMember(int memberId, String memberName, String phone, String stuName, String stuClass) {
		super(memberId, memberName, phone);
		this.stuName = stuName;
		this.stuClass = stuClass;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuClass() {
		return stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}

	// 도서반 => 기본정보+ 도서반장, 강의실이름

	@Override
	public String toString() {
		return "BookMember [stuName=" + stuName + ", stuClass=" + stuClass + ", getMemberId()=" + getMemberId()
				+ ", getMemberName()=" + getMemberName() + ", getPhone()=" + getPhone() + "]";
	}
	// 도서반의 반장이름.
		// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
		
		// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 
}