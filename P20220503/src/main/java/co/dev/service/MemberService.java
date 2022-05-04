package co.dev.service;

import java.util.List;

import co.dev.dao.MemberDAO;
import co.dev.vo.MemberVO;

public class MemberService {
	MemberDAO dao = new MemberDAO(); // db CRUD 작업을 위한 요소.
	
	public void memberDelete(MemberVO member) {
		dao.deleteMember(member);
	}
	
	public void memberUpdate(MemberVO member) {
		dao.updateMember(member);
	}
	public MemberVO memberSearch(String id) {
		return dao.searchMember(id);
	}

	public void memberInsert(MemberVO member) {
		dao.insertMember(member);
	}
	
	public List<MemberVO> memberList() {
		return dao.ListMember();
	}
}
