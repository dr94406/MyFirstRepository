package Book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookServiceOracle extends DAO implements BookService {

	// 입력처리
	@Override
	public void insertBook(Book book) {
		conn = getConnect();
		String sql = "insert into book_info  (book_no, book_name, book_genre)\r\n" +
					"values(?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql); // ? <= 매개변수값중에서 employeeId 필드값.
			psmt.setInt(1, book.getBookNo());
			psmt.setString(2, book.getBookName());
			psmt.setString(3, book.getBookGenre());

			int r = psmt.executeUpdate(); // 실행된 건수를 반환해줍니다.
			System.out.println(r + "건 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행, 예외발생 => 반드시 실행코드.
			disconnect();
		}

	}

	// 한 건 조회. (책번호로)
	@Override
	public Book getBook(int aoa) { // 매개변수 타입
		conn = getConnect();
		Book book = null;
		String sql = "select * from book_info where book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, aoa);
			rs = psmt.executeQuery(); // 실행건수만큼 반복자.
			if (rs.next()) {
				book = new Book();
				book.setBookNo(rs.getInt("book_no")); // 값을 읽어와서 지정하겠습니다.
				book.setBookName(rs.getString("book_name"));
				book.setBookGenre(rs.getString("book_genre"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return book;
	}

	// 전체조회
	@Override
	public List<Book> bookList() {
		List<Book> list = new ArrayList<Book>(); // 조회된 결과값을 담기위한 컬렉션.

		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select * from book_info order by book_name");
			rs = psmt.executeQuery(); // 실행건수만큼 반복자.
			while (rs.next()) { // 반복자를 통해 요소를 가지고 올 수 있는지 체크. 있으면 하나 가지고 옴.
				Book book = new Book();
				book.setBookNo(rs.getInt("book_no")); // 값을 읽어와서 지정하겠습니다.
				book.setBookName(rs.getString("book_name"));
				book.setBookGenre(rs.getString("book_genre"));

				list.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override // 수정처리
	public void modifyBook(Book book) {   
		conn = getConnect();
		String sql = "update book_info " +  "set book_name = ?," + "book_genre = ? " + "where book_no = ?";
		try {
			psmt = conn.prepareStatement(sql); // ? <= 매개변수값중에서 employeeId 필드값.
			psmt.setString(1, book.getBookName());
			psmt.setString(2, book.getBookGenre());
			psmt.setInt(3, book.getBookNo());
			int r = psmt.executeUpdate(); // 실행된 건수를 반환해줍니다.
			System.out.println(r + "건 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행, 예외발생 => 반드시 실행코드.
			disconnect();
		}
	}

	// 삭제처리
	@Override
	public void removeBook(int glo) {
		conn = getConnect();
		String sql = "delete from book_info\r\n" + "where book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, glo);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override // 번호로 조회 기능.
	public List<Book> searchBook(String gro) {
		List<Book> Books = new ArrayList<Book>();
		conn = getConnect();
		Book gra = null;
		String sql = "select * from book_info where book_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, gro);
			rs = psmt.executeQuery(); // 실행건수만큼 반복자.
			if (rs.next()) {
				gra = new Book();
				gra.setBookNo(rs.getInt("book_no")); // 값을 읽어와서 지정하겠습니다.
				gra.setBookName(rs.getString("book_name"));
				gra.setBookGenre(rs.getString("book_genre"));

				Books.add(gra);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return Books;
	}

	@Override
	public void saveToFile() { // 안해도됨.

	}

}
