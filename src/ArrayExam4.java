/**
 * 국,영,수, 총합, 평균 성적 처리 프로그램을 작성하시오.
 * @author smart17
 *
 */
public class ArrayExam4 {

	public static void main(String[] args) {
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		int avg = 0;
		
		kor = 50;
		eng = 80;
		math = 90;
		total = kor + eng + math;
		avg = total / 3;
		System.out.printf("국어:%d, 영어:%d, 수학:%d",kor, eng, math );
		System.out.printf(" 총점:%d, 평균:%d",total, avg );
		
		}

	}