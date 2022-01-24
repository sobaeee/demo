/**
 * for 문
 * 1년 월일 표시
 * @author smart17
 *
 */
public class Loop4 {

	public static void main(String[] args) {
		for(int j = 1; j <= 12; j++) {
			int lastDayOfMonth = 0;
			switch (j) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDayOfMonth = 31;
				break;
			case 2:
				lastDayOfMonth = 28;
				break;
			default:
				lastDayOfMonth = 30;
				break;
			}
			
			System.out.print(j+"월 ");
		for(int i = 1; i <= lastDayOfMonth; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		}
}
}