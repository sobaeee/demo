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
public class Loop7 {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++ ) {
			System.out.println(i);
			//i값이 5이면 멈춰라
			if(i == 5) {
				break;
			}
		}
}
	
}