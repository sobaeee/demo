/**
 * 국,영,수, 총합, 평균 성적 처리 프로그램을 작성하시오.
 * @author smart17
 *
 */
public class ArrayExam5 {

	public static void main(String[] args) {
		int[] grade = new int [5];
		System.out.println(grade.length);
		
		grade[0] = 50;
		grade[1] = 80;
		grade[2] = 90;
		grade[3] = grade[0] + grade[1] + grade[2];
		grade[4] = grade[3] / 3;
		System.out.printf("국어:%d, 영어:%d, 수학:%d",grade[0], grade[1], grade[2] );
		System.out.printf(" 총점:%d, 평균:%d",grade[3], grade[4] );
		
		}

	}