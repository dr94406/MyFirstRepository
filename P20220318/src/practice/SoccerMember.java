package practice;

public class SoccerMember extends Member {
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A
	private String SoccerName;
	private String SocckerClass;

	public String getCoachName() {
		return SoccerName;
	}

	public void setCoachName(String coachName) {
		this.SoccerName = coachName;
	}

	public String getRockerRoom() {
		return SocckerClass;
	}

	public void setRockerRoom(String rockerRoom) {
		SocckerClass = rockerRoom;
	}

	public SoccerMember(int memberId, String memberName, String phone, String coachName, String rockerRoom) {
		super(memberId, memberName, phone);
		this.SoccerName = coachName;
		SocckerClass = rockerRoom;
	}

	@Override
	public String toString() {
		return " [코치의 이름은 =" + SoccerName + ", 라커룸의 이름은 =" + SocckerClass + ", 회원의 아이디는="
				+ getMemberId() + ", 회원의 이름은 =" + getMemberName() + ", 회원의 휴대전화 번호는 =" + getPhone() + "]";
	}
}
