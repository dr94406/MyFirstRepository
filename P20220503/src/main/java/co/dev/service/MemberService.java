package co.dev.service;

import java.util.List;

import co.dev.dao.MemberDAO;
import co.dev.vo.MemberVO;

public class MemberService {
	MemberDAO dao = new MemberDAO(); // db CRUD 작업을 위한 요소.

	public void memberInsert(MemberVO member) {
		dao.insertMember(member);
	}
	
	public List<MemberVO> memberList() {
		return dao.MemberList();
	}
}
