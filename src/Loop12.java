import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * for문 1부터 10까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하세요.
 * 
 * @author smart17
 *
 */
public class Loop12 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				sum += i; // 대입연산자
				// sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}