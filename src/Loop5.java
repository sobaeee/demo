/**
 * for 문
 * 시계
 * @author smart17
 *
 */
public class Loop5 {

	public static void main(String[] args) {
		int sec = (60*60*14)+(32*60);
		//System.out.println(sec); //전체초
		for(;;) {
			
			sec++;
			
			System.out.print((sec)/(60*60) + "시 "); //시
			System.out.print(((sec)%(60*60))/60 + "분 "); //분
			System.out.println(((sec)%(60*60))%60 + "초"); //초
			
			
			
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
}
	
}