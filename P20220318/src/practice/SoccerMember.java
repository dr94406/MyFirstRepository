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
		super();
		this.SoccerName = coachName;
		SocckerClass = rockerRoom;
	}

	@Override
	public String toString() {
		return "SoccerMember [coachName=" + SoccerName + ", RockerRoom=" + SocckerClass + ", getMemberId()="
				+ getMemberId() + ", getMemberName()=" + getMemberName() + ", getPhone()=" + getPhone() + "]";
	}
}
