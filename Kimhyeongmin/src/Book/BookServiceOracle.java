package Book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookServiceOracle extends DAO implements BookService {

	// 입력처리
	@Override
	public void insertBook(Book book) {
		conn = getConnect();
		String sql = "insert into book_info  (book_id, title, author, publisher, price)\r\n"
				+ "values(?, ?, ?, ?, ? )";
		try {
			psmt = conn.prepareStatement(sql); // ? <= 매개변수값중에서 getBookId 필드값.
			psmt.setInt(1, book.getBookId());
			psmt.setString(2, book.getTitle());
			psmt.setString(3, book.getAuthor());
			psmt.setString(4, book.getPublisher());
			psmt.setInt(5, book.getPrice());
//			psmt.setString(6, book.getRental());

			int r = psmt.executeUpdate(); // 실행된 건수를 반환해줍니다.
			System.out.println(r + "건 입력되었습니다.");

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
		String sql = "select * from book_info where book_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, aoa);
			rs = psmt.executeQuery(); // 실행건수만큼 반복자.
			if (rs.next()) {
				book = new Book();
				book.setBookId(rs.getInt("book_id")); // 값을 읽어와서 지정하겠습니다.
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPublisher(rs.getString("publisher"));
				book.setPrice(rs.getInt("price"));
				book.setRental(rs.getString("rental"));
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

		conn = getConnect(); // select * from book_info order by book_id;
		try {
			psmt = conn.prepareStatement("select * from book_info where rental not in ('Y') order by book_id ");
			rs = psmt.executeQuery(); // 실행건수만큼 반복자.
			while (rs.next()) { // 반복자를 통해 요소를 가지고 올 수 있는지 체크. 있으면 하나 가지고 옴.
				Book book = new Book();

				// 출력되는지 확인
//				System.out.println(rs.getString("title"));

				book.setBookId(rs.getInt("book_Id")); // 값을 읽어와서 지정하겠습니다.
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setPublisher(rs.getString("publisher"));
				book.setPrice(rs.getInt("price"));
				book.setRental(rs.getString("rental"));
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
		String sql = "update book_info " + "set title = ?, " + "author = ?, " + "publisher = ?, " + "price = ?  "
				 + "where book_id = ?";
		try {
			psmt = conn.prepareStatement(sql); // ? <= 매개변수값중에서 필드값.
			psmt.setString(1, book.getTitle());
			psmt.setString(2, book.getAuthor());
			psmt.setString(3, book.getPublisher());
			psmt.setInt(4, book.getPrice());
			psmt.setInt(5, book.getBookId());
			
			int r = psmt.executeUpdate(); // 실행된 건수를 반환해줍니다.
			System.out.println(r + "건 수정되었습니다.");
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
		String sql = "delete from book_info\r\n" + "where book_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, glo);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override // 이름으로로 조회 기능.
	public List<Book> searchBook(String gro) {
		List<Book> Books = new ArrayList<Book>();
		conn = getConnect();
		Book gra = null;
		String sql = "select * from book_info where title = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, gro);
			rs = psmt.executeQuery(); // 실행건수만큼 반복자.
			if (rs.next()) {
				gra = new Book();
				gra.setBookId(rs.getInt("book_id")); // 값을 읽어와서 지정하겠습니다.
				gra.setTitle(rs.getString("title"));
				gra.setAuthor(rs.getString("author"));
				gra.setPublisher(rs.getString("publisher"));
				gra.setPrice(rs.getInt("price"));
				gra.setRental(rs.getString("rental"));
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

	@Override // 대여기능 
	public void rentalBook(Book book) {
		conn = getConnect();
		String sql = "update book_info " + "set rental = ? " + "where book_id = ?";
		try {
			psmt = conn.prepareStatement(sql); // ? <= 매개변수값중에서 필드값.
			psmt.setString(1, book.getRental());
			psmt.setInt(2, book.getBookId());

			int r = psmt.executeUpdate(); // 실행된 건수를 반환해줍니다.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 정상실행, 예외발생 => 반드시 실행코드.
			disconnect();
		}
	}

}
