package co.test.dao;

import java.util.List;

import co.test.vo.BookVO;

public class BookDAO extends DAO {

	public List<BookVO> bookList() {
		String sql = "";
		return null;
	}

	public BookVO selectBook(String bookCode) {
		String sql = "";
		BookVO vo = new BookVO();

		return vo;
	}

	public void insertBook(BookVO book) {
		String sql = "";
	}

	public void updateBook(BookVO book) {
		String sql = "";
	}

	public void deleteBook(String bookCode) {
		String sql = "";
	}
}
