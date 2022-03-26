package practice;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A

	private String sccName;
	private String sccClass;


	public SoccerMember(int memberId, String memberName, String phone, String sccName, String sccClass) {
		super(memberId, memberName, phone);
		this.sccName = sccName;
		this.sccClass = sccClass;
	}

	public String getSccName() {
		return sccName;
	}

	public void setSccName(String sccName) {
		this.sccName = sccName;
	}

	public String getSccClass() {
		return sccClass;
	}

	public void setSccClass(String sccClass) {
		this.sccClass = sccClass;
	}

	// 축구반 => 기본정보+ 코치이름, 락커룸이름
	@Override
	public String toString() {
		return "SoccerMember [sccName=" + sccName + ", sccClass=" + sccClass + ", getMemberId()=" + getMemberId()
				+ ", getMemberName()=" + getMemberName() + ", getPhone()=" + getPhone() + "]";
	}

}
