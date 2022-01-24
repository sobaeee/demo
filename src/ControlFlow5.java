/**
 * 성적 처리 프로그램을 작성하시오.
 * 취득 점수가
 * 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C
 * 70점 미만이면 F를 출력하시오.
 * 예 : 나의 점수가 59점이면 F가 출력됩니다.
 * if, switch를 이용하여
 * @author smart17
 *
 */
public class ControlFlow5 {

	public static void main(String[] args) {
		int i = 45;
		int j = 10;
		if(i >= 90) {
			System.out.println("A");
		}
		else if(i >= 80) {
			System.out.println("B");
		}
		else if(i >= 70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}

		switch (i/j) {
		case 10: System.out.println("A입니다."); break;
		case 9: System.out.println("A입니다."); break;
		case 8: System.out.println("B입니다."); break;
		case 7: System.out.println("C입니다."); break;
		default: System.out.println("F입니다."); break;
		
		}

	}
}