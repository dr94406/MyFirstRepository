package Book;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
					list.get(i).setAuthor(book.getAuthor());
					list.get(i).setPublisher(book.getPublisher());
					list.get(i).setPrice(book.getPrice());
					list.get(i).setRental(book.getRental());
				}
			}
		}

		@Override
		public void removeBook(int glo) {

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

		@Override
		public void rentalBook(Book book) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getBookId() == book.getBookId()) {
					list.get(i).setRental(book.getRental());
				}
			}
		}
	} // end of StudentServiceImpl

	public void execute() {
		BookService service = null;
//						service = new StudentServiceImpl();
//						service = new StudentServiceFile();
		service = new BookServiceOracle();
		// 메뉴: 1.추가 2.리스트 3.한건조회(학생번호) 4.수정 5.삭제 6.이름조회(이름) 7.장르로조회 9.종료
		while (true) {
			System.out.println();
			System.out.println("반갑습니다, 도서 관리 프로그램에 오신것을 환영합니다.\n아래의 메뉴 중 원하는 것을 선택하세요.");
			System.out.println();
			System.out.println("\n[1.도서 등록 기능] \n[2.도서 전체 조회기능] \n[3.도서 번호로 조회기능]\n[4.도서 이름으로 조회기능]\n[5.도서 삭제기능]\n[6.도서 정보 수정기능]\n[7.도서 대여기능]\n[8.도서 반납기능]\n[9.종료]");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				// 책정보 추가입력. : 책번호, 책이름, 책저자,책제작사,책금액 입력
				int bookId;
				while (true) {
					System.out.println();
					System.out.println("도서번호를 입력하세요.");
					try {
						scn.nextLine();
						bookId = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("입력한 타입이 맞지않습니다.");
						continue;
					}
				}
				System.out.println("도서명을 입력하세요.");
				scn.nextLine();
				String title = scn.nextLine();
				System.out.println("작가명을 입력하세요.");
				String author = scn.nextLine();
				System.out.println("출판사를 입력하세요.");
				String publisher = scn.nextLine();
				int price;
				while (true) {
					System.out.println("도서가격을 입력하세요.");
					try {
						price = scn.nextInt();
					} catch (InputMismatchException e) {
						scn.nextLine();
						System.out.println("입력한 타입이 맞지않습니다.");
						continue;
					}
					scn.nextLine();
					Book s1 = new Book(bookId, title, author, publisher, price);
					service.insertBook(s1);
					break;
				}
			} else if (menu == 2) {
				List<Book> list = service.bookList();
				for (Book s : list) {
					System.out.println(s.toString());
				}

			} else if (menu == 3) {
				int bookId;
				while (true) {
					System.out.println("조회할 도서번호를 입력하세요.");
					try {
						scn.nextLine();
						bookId = scn.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("입력한 타입이 맞지않습니다.");
						continue;
					}
					Book book = service.getBook(bookId);
					System.out.println();
					if (book == null) {
						System.out.println("조회된 번호가 없습니다, 다시입력해주세요.");
					} else {
						System.out.println(book.toString());
					}
					break;
				}
			} else if (menu == 4) { // 이름으로 조회
				System.out.println("조회할 도서이름을 입력하세요.");
				String searchTitle = scn.nextLine();
				List<Book> list = service.searchBook(searchTitle);
				System.out.println();
				for (Book s : list) {
					System.out.println(s.toString());
				}

			} else if (menu == 5) { // 삭제.
				Book s2 = new Book();
				int number;
				int bookId = 0;
				while (true) {
					System.out.println("삭제할 도서번호를 입력하세요.");
					try {
						scn.nextLine();
						number = scn.nextInt();
						service.removeBook(number);
						break;
					} catch (InputMismatchException e) {
						System.out.println("입력한 타입이 맞지않습니다.");
						continue;
					}
				} 
			} else if (menu == 6) {
				Book s2 = new Book();
				int bookId;
				while (true) {
					System.out.println("수정할 도서번호를 입력하세요.");
					try {
						scn.nextLine();
						bookId = scn.nextInt();
						s2.setBookId(bookId);
						scn.nextLine();
						break;
					} catch (InputMismatchException e) {
						System.out.println("입력한 타입이 맞지않습니다.");
						continue;
					} 
				}
				Book book = service.getBook(bookId);
				System.out.println();
				if (book == null) {
					scn.nextLine();
					System.out.println("유효하지 않는 번호입니다, 수정할 번호를 다시입력해주세요.");
					bookId = scn.nextInt();
				}
				System.out.println("도서명을 입력하세요.");
				String title = scn.nextLine();
				s2.setTitle(title);
				System.out.println("작가명을 입력하세요.");
				String author = scn.nextLine();
				s2.setAuthor(author);
				System.out.println("출판사를 입력하세요.");
				String publisher = scn.nextLine();
				s2.setPublisher(publisher);
				int price;
				while (true) {
					System.out.println("도서가격을 입력하세요. ");
					try {
						price = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						scn.nextLine();
						System.out.println("입력한 타입이 맞지않습니다.");
						continue;
					}
				}
				s2.setPrice(price);
				service.modifyBook(s2);
				System.out.println("도서정보 수정이 완료되었습니다.");

			} else if (menu == 7) { // 한 문자만 받을때는 아스키코드를 생각해라...(CHAR)
				Book s2 = new Book();
				int bookId;
				while (true) {
					System.out.println("대여할 도서번호를 입력하세요.");
					try {
						bookId = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						scn.nextLine();
						System.out.println("입력한 타입이 맞지않습니다.");
						continue;
					}
				}
				s2.setBookId(bookId);
				if (service.getBook(bookId) == null) {
					System.out.println("대여할 수 없는 도서입니다.");
				} else {
					System.out.println("입력한 도서를 대여하시겠습니까?. Y/N");
					char a = scn.next().charAt(0);
					if (a == 0x4E || a == 0x6E) {
						System.out.println("아니오");
						s2.setRental("N");
						System.out.println("도서대여가 취소되었습니다.");
					} else if (a == 0x59 || a == 0x79) {
						System.out.println("네");
						if (service.getBook(bookId).getRental().equals("Y")) {
							System.out.println("이미 대여중인 도서입니다.");

						} else {
							s2.setRental("Y");
							service.rentalBook(s2);
							System.out.println("도서 대여가 완료되었습니다.");
						}
					} else {
						System.out.println("입력한 값이 유효하지 않습니다.");
					}
				}

			} else if (menu == 8) {
				Book s2 = new Book();
				int bookId;
				while (true) {
					System.out.println("반납할 도서번호를 입력하세요.");
					try {
						bookId = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						scn.nextLine();
						System.out.println("입력한 타입이 맞지않습니다.");
						continue;
					}
				}
				s2.setBookId(bookId);
				if (service.getBook(bookId) == null) {
					System.out.println("반납할 도서가 없는 번호입니다.");
				} else {
					System.out.println("입력한 도서를 반납하시겠습니까?. Y/N");
					char a = scn.next().charAt(0);
					if (a == 0x4E || a == 0x6E) {
						System.out.println("아니오");
						s2.setRental("Y");
						System.out.println("도서반납이 취소되었습니다.");

					} else if (a == 0x59 || a == 0x79) {
						System.out.println("네");

						if (service.getBook(bookId).getRental().equals("N")) {
							System.out.println("빌리지 않은 도서입니다.");
						} else {
							s2.setRental("N");
							service.rentalBook(s2);
							System.out.println("도서 반납이 완료되었습니다.");
						}
					} else {
						System.out.println("입력한 값이 유효하지 않습니다.");
					}
				}
			} else if (menu == 9) {
				System.out.println("프로그램을 종료하겠습니다.");
				service.saveToFile();
				break;
			}
		} // end of while()
		System.out.println("end of program");
	}
}