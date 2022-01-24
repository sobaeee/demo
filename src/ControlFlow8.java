/**
 * 가위[1], 바위[2], 보[3] 게임프로그램을 작성하시오. 두명의 유저가 임의의 값을 선택하여 결과를 출력하는 프로그램
 *
 * @author smart17
 */
public class ControlFlow8 {

	public static void main(String[] args) {
		int user1 = (int)(Math.random()*3)+1; // 본인
		int user2 = (int)(Math.random()*3)+1; // 상대방

		if (user1 == 1) {
		System.out.println("가위");
		} else if (user1 == 2) {
			System.out.println("바위");
		} else if (user1 == 3) {
			System.out.println("보");
		}
	
		if (user2 == 1) {
			System.out.println("가위");
			} else if (user2 == 2) {
				System.out.println("바위");
			} else if (user2 == 3) {
				System.out.println("보");
		}

		if (user1 == 1 && user2 == 1) {
			System.out.println("비겼습니다.");
		} else if (user1 == 1 && user2 == 2) {
			System.out.println("ㅠㅠ.");
		} else if (user1 == 1 && user2 == 3) {
			System.out.println("ㅎㅎ.");
		} else if (user1 == 2 && user2 == 1) {
			System.out.println("ㅎㅎ.");
		} else if (user1 == 2 && user2 == 2) {
			System.out.println("비겼습니다.");
		} else if (user1 == 2 && user2 == 3) {
			System.out.println("ㅠㅠ.");
		} else if (user1 == 3 && user2 == 1) {
			System.out.println("ㅠㅠ.");
		} else if (user1 == 3 && user2 == 2) {
			System.out.println("ㅎㅎ.");
		} else if (user1 == 3 && user2 == 3) {
			System.out.println("비겼습니다.");
		}
	}
}