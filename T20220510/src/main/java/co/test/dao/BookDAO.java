package co.test.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.test.vo.BookVO;

public class BookDAO extends DAO {

	public List<BookVO> ListBook() {

		conn = getConnect();
		List<BookVO> list = new ArrayList<BookVO>();
		try {
			psmt = conn.prepareStatement("select * from book_info order by 1");
			rs = psmt.executeQuery();
			while (rs.next()) {
				BookVO vo = new BookVO();
				vo.setBookCode(rs.getString("book_Code"));
				vo.setBookTitle(rs.getString("book_Title"));
				vo.setBookAuthor(rs.getString("book_Author"));
				vo.setBookPress(rs.getString("book_Press"));
				vo.setBookPrice(rs.getInt("book_Price"));

				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return list;
	}

	public BookVO selectBook(String bookCode) {
		conn = getConnect();
		String sql = "select * from book_info where book_code=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookCode);
			rs = psmt.executeQuery();
			if (rs.next()) {
				BookVO vo = new BookVO();
				vo.setBookCode(rs.getString("book_Code"));
				vo.setBookTitle(rs.getString("book_Title"));
				vo.setBookAuthor(rs.getString("book_Author"));
				vo.setBookPress(rs.getString("book_Press"));
				vo.setBookPrice(rs.getInt("book_Price"));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
		return null;
	}

	public void insertBook(BookVO book) {
		conn = getConnect();
		String sql = "insert into book_info(book_code,book_title,book_author,book_press,book_price) values(create_bookcode,?,?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getBookTitle());
			psmt.setString(2, book.getBookAuthor());
			psmt.setString(3, book.getBookPress());
			psmt.setInt(4, book.getBookPrice());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력 되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}

	public void updateBook(BookVO book) {
		conn = getConnect();
		String sql = "update book_info set book_title=?, book_author=?, book_press=?, book_price=? where book_code=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getBookTitle());
			psmt.setString(2, book.getBookAuthor());
			psmt.setString(3, book.getBookPress());
			psmt.setInt(4, book.getBookPrice());
			psmt.setString(5, book.getBookCode());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정 되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}
	}

	public void deleteBook(String bookCode) {
		conn = getConnect();
		String sql = "DELETE FROM book_info where book_code=?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookCode);

			int r = psmt.executeUpdate();

			if (r > 0) {
				System.out.println(r + "건 삭제되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disConnect();
		}

	}
}
