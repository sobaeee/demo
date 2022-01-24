import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * for 문 50번까지 반복 삼육구를 출력하세요. 3의 배수일때는 짝이라고 출력하세요. System.out.println("짝");
 * 
 * @author smart17
 *
 */
public class Loop11 {

	public static void main(String[] args) {
		int i = 0;
			while ( i < 50 ) {
				i++;
				if(i%3 == 0) {
				System.out.println("짝");
				continue;
			}
			System.out.println(i);
		}
	}

}