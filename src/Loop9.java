import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * for 문
 * @author smart17
 *
 */
public class Loop9 {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++ ) {
			//i값이 5이면 멈춰라
			//if(i == 5)
			//짝수만 출력하세요
			if(i%2 != 1) {
				continue;
			}
			System.out.println(i);
		}
}
	
}