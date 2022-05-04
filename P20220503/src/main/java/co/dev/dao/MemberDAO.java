package co.dev.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.dev.DAO;
import co.dev.vo.MemberVO;

public class MemberDAO extends DAO { // co.dev.DAO를 상속받음.

	public void updateMember(MemberVO member) {
		conn = getConnect();
		String sql = "update member set  name=?, pw=?, email=? where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getName());
			psmt.setString(2, member.getPw());
			psmt.setString(3, member.getEmail());
			psmt.setString(4, member.getId());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정 되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}

	public void deleteMember(MemberVO member) {
		conn = getConnect();
		String sql = "delete * from member where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			rs = psmt.executeQuery();
			if (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}

	public MemberVO searchMember(String id) {
		conn = getConnect();
		String sql = "select * from member where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setPw(rs.getString("pw"));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return null; // 한 건 조회 후 없으면 null값 리턴.
	}

	public List<MemberVO> ListMember() {

		conn = getConnect();
		List<MemberVO> list = new ArrayList<MemberVO>();

		try {
			psmt = conn.prepareStatement("select * from member order by id");
			rs = psmt.executeQuery();
			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
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
