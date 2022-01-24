import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * for 문
 * 시계
 * @author smart17
 *
 */
public class Loop6 {

	public static void main(String[] args) {

		for(;;) {
			
			LocalDateTime ldt = LocalDateTime.now();
			System.out.print(ldt.getHour()+":");
			System.out.print(ldt.getMinute()+":");
			System.out.println(ldt.getSecond());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
}
	
}