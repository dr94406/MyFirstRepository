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
				if (list.get(i).getBookNo() == boo) {
					return list.get(i);
				}
			}
			return null;
		}

		@Override
		public void modifyBook(Book book) { // 수정.
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getBookNo() == book.getBookNo()) {
					list.get(i).setBookName(book.getBookName()); // 영어점수수정.
					list.get(i).setBookGenre(book.getBookGenre());
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
				if (list.get(i).getBookName().equals(name)) {
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
			System.out.println("1.책정보입력 2.리스트 3.한건조회 4.수정 5.삭제 6.번호로조회 7.장르로조회 9.종료.");
			System.out.print("선택>> ");

			int menu = scn.nextInt();
			if (menu == 1) {
				// 책정보 추가입력. : 책번호, 책이름, 장르.
				System.out.println("책번호입력>>");
				int bookNo = scn.nextInt();
				System.out.println("책이름입력>>");
				String name = scn.next();
				System.out.println("책장르입력>>");
				String bookGenre = scn.next();

				Book s1 = new Book(bookNo, name, bookGenre);
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
				int bookNo = scn.nextInt();
				s2.setBookNo(bookNo);
				System.out.println("책이름 입력>>");
				String bookName = scn.next();
				s2.setBookName(bookName);
				System.out.println("책장르입력>>");
				String bookGenre = scn.next();
				s2.setBookGenre(bookGenre);
				
//				Student s1 = new Student(stuNo, null, engScore, korScore);
				service.modifyBook(s2);
				System.out.println("처리가 완료되었습니다.");

			} else if (menu == 5) { // 삭제.
				System.out.println("삭제할 책번호를 입력하세요.");
				int number = scn.nextInt();
				service.removeBook(number);
				
			} else if (menu == 6) { // 번호로 여러건 조회.
				System.out.println("조회할 책번호 입력>> ");
				String searchNo = scn.next();
				List<Book> list = service.searchBook(searchNo);
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