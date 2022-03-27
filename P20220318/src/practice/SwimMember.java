package practice;

// source -> getset ->using field,To string inherited 해서 기본정보 3개 선택
public class SwimMember extends Member { // Member 의 변수를 상속해서 들고오겠습니다.
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	// 수영반 => 기본정보+ 강사이름, 수영등급
	// 정보출력시 => 강사이름: 홍길동, 등급: A

	private String swimName;
	private String swimClass;

	public SwimMember(String swimName, String swimClass) { // 생성자를 선언해주겠습니다.
		super();
		this.swimName = swimName;
		this.swimClass = swimClass;
	}

	public String getSwimName() {
		return swimName;
	}

	public void setSwimName(String swimName) {
		this.swimName = swimName;
	}

	public String getSwimClass() {
		return swimClass;
	}

	public void setSwimClass(String swimClass) {
		this.swimClass = swimClass;
	}

	@Override
	public String toString() {
		return "SwimMember [swimName=" + swimName + ", swimClass=" + swimClass + ", getMemberId()=" + getMemberId()
				+ ", getMemberName()=" + getMemberName() + ", getPhone()=" + getPhone() + "]";
	}
}
