package Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookApp {

	List<Book> list = new ArrayList<Book>();
	Scanner scn = new Scanner(System.in);

	// 멤버클래스.
	class BookServiceImpl implements BookService {
		@Override
		public void insertBook(Book book) {
			list.add(book); // 추가.
		}

		@Override
		public Book getBook(int boo) { // 학생번호로 한건 조회.
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getBookId() == boo) {
					return list.get(i);
				}
			}
			return null;
		}

		@Override // 수정
		public void modifyBook(Book book) { //
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getBookId() == book.getBookId()) {
					list.get(i).setTitle(book.getTitle());
					list.get(i).setWriter(book.getWriter());
					list.get(i).setPublisher(book.getPublisher());
					list.get(i).setPrice(book.getPrice());
				}
			}
		}

		@Override
		public void removeBook(int boo) {

		}

		@Override
		public List<Book> searchBook(String name) {
			List<Book> searchList = new ArrayList<Book>();
			// 찾았다고 종료X
			for (int i = 0; i < list.size(); i++) {
				// 같은 이름이 있는지 찾아보고 있으면 searchList.add()
				if (list.get(i).getTitle().equals(name)) {
					searchList.add(list.get(i));
				}
			}
			return searchList;
		}

		@Override
		public void saveToFile() {
			System.exit(0);
		}

		@Override
		public List<Book> bookList() {
			// TODO Auto-generated method stub
			return list;
		}
	} // end of StudentServiceImpl

	public void execute() {
		BookService service = null;
//						service = new StudentServiceImpl();
//						service = new StudentServiceFile();
		service = new BookServiceOracle();
		// 메뉴: 1.추가 2.리스트 3.한건조회(학생번호) 4.수정 5.삭제 6.이름조회(이름) 7.장르로조회 9.종료
		while (true) {
			System.out.println("1.책정보 입력 2.전체리스트 3.한건조회  4.수정 5.삭제 6.번호로조회  9.종료.");
			System.out.print("선택>> ");

			int menu = scn.nextInt();
			if (menu == 1) {
				// 책정보 추가입력. : 책번호, 책이름, 책저자,책제작사,책금액 입력
				System.out.println("책번호입력>>");
				int bookId = scn.nextInt();
				
				System.out.println("책이름입력>>");
				String title = scn.next();
				
				System.out.println("책저자입력>>");
				String writer = scn.next();
				
				System.out.println("책제작사입력 >>");
				String publisher = scn.next();
				
				System.out.println("책금액입력>>");
				int price = scn.nextInt();
				
				Book s1 = new Book(bookId, title, writer,publisher,price);
				service.insertBook(s1);

			} else if (menu == 2) {
				List<Book> list = service.bookList();
				for (Book s : list) {
					System.out.println(s.toString());
				}

			} else if (menu == 3) { // 한건 조회.
				System.out.println("조회할 책번호 입력>>");
				int bookNo = scn.nextInt();
				Book book = service.getBook(bookNo);
				if (book == null) {
					System.out.println("조회된 결과가 없습니다.");
				} else {
					System.out.println(book.toString());
				}

			} else if (menu == 4) {
				Book s2 = new Book();
				System.out.println("수정할 책번호입력>>");
				int bookId = scn.nextInt();
				s2.setBookId(bookId);
				System.out.println("책이름 입력>>");
				String title = scn.next();
				s2.setTitle(title);
				System.out.println("책저자입력>>");
				String writer = scn.next();
				s2.setWriter(writer);
				System.out.println("책가격입력");
				int price = scn.nextInt();
				s2.setPrice(price);
				service.modifyBook(s2);
				System.out.println("처리가 완료되었습니다.");

			} else if (menu == 5) { // 삭제.
				System.out.println("삭제할 책번호를 입력>>");
				int number = scn.nextInt();
				service.removeBook(number);

			} else if (menu == 6) { // 번호로 여러건 조회.
				System.out.println("조회할 책번호 입력>>");
				String searchId = scn.next();
				List<Book> list = service.searchBook(searchId);
				for (Book s : list) {
					System.out.println(s.toString());
				}

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				service.saveToFile();
				break;
			}
		} // end of while()
		System.out.println("end of program");
	}
}