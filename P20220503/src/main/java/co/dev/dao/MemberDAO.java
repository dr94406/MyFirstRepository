package co.dev.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.dev.DAO;
import co.dev.vo.MemberVO;

public class MemberDAO extends DAO {

	// 수정.
	public void updateMember(MemberVO vo) {
		System.out.println("수정완료");
	}

	// 삭제.
	public void deleteMember(String id) {
		System.out.println("삭제완료");
	}

	// 단건조회.
	public MemberVO searchMember(String id) {
		conn = getConn();
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
				vo.setPasswd(rs.getString("passwd"));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConn();
		}
		return null;
	}

	// 리스트.
	public List<MemberVO> listMember() {
		conn = getConn();
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			psmt = conn.prepareStatement("select * from member order by id");
			rs = psmt.executeQuery();
			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setEmail(rs.getString("email"));
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setProfile(rs.getString("profile"));

				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConn();
		}
		return list;
	}

	// 입력.
	public void insertMember(MemberVO member) {
		conn = getConn();
		String sql = "insert into member(id,name,passwd,email,profile) values(?,?,?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getName());
			psmt.setString(3, member.getPasswd());
			psmt.setString(4, member.getEmail());
			psmt.setString(5, member.getProfile());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConn();
		}
	}
}
