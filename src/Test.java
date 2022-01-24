import java.util.Arrays;
import java.util.HashSet;

/**
 * 로또
 * @author smart00
 *
 */
public class Test {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			
			HashSet<Integer> hs = new HashSet<Integer>();
			while(true) {
				hs.add((int)(Math.random()*45)+1);
				
				if(hs.size() == 6) {
					break;//반복문을 빠져나간다.
				}
			}
			
			//2022-01-15일 로또 1등 번호 6개 출력
			System.out.println(hs);
		}
	}

}



