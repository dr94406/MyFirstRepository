package Book;

public class BookExe { 
	public static void main(String[] args) {
		BookApp app = new BookApp(); // 인스턴스 생성
		app.execute();
	}
}
//이곳이 메인메소드 (실행창, 로그인 정보 등을 넣는다, ID,PW를 입력하면 연결성공 이라는 문구와 함께
// 관리자 권한으로 입장하고 메뉴얼인 1.입력 2.리스트 3.조회 4.수정 9.종료가 생성된다.