import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * 출력결과 : 3+6+9=18
 * 
 * @author smart17
 *
 */
public class Loop13 {

	public static void main(String[] args) {
		int sum = 0;
		int max = 30;
		for (int i = 1; i <= max; i++) {
			if (i % 3 == 0) {
				sum += i; // 대입연산자
				// sum = sum + i;
				System.out.print(i);
				if(i != (max- (max%3))) {
				System.out.print("+");
			}
			
		}
	}
		System.out.print("=" +sum);
}
}