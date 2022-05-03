package co.dev.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.dev.DAO;
import co.dev.vo.MemberVO;

public class MemberDAO extends DAO { // co.dev.DAO를 상속받음.
	
	public List<MemberVO> MemberList() {
		
		conn = getConnect();
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			psmt = conn.prepareStatement("select * from member order by id");
			rs = psmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setEmail(rs.getString("email"));
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPw(rs.getString("pw"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
	} finally {
		disConnect();
	}
	return list;
}
	public void insertMember(MemberVO member) {
		conn = getConnect();
		String sql = "insert into member(id,name,pw,email) values(?,?,?,?)";
	
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getName());
			psmt.setString(3, member.getPw());
			psmt.setString(4, member.getEmail());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력 되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}
}
