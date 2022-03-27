package practice;

// 이곳에서는 to string을 할 때 메소드는 설정하지 않는다. 
public class Member {
	private int memberId;
	private String memberName;
	private String phone;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) { // private를 사용하였으므로 겟셋을 사용하여 권한을 확장해주겠습니다.
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Member(int memberId, String memberName, String phone) { // 생성자를 선언함으로 코드의 간결화 및 필요한 기능을 추가합니다.
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", phone=" + phone + "]";
	}

}
