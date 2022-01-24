/**
 * 개인 연습
 * 
 * @author smart17
 *
 */
public class ArrayExam14 {

	public static void main(String[] args) {
		int max = 0;
		//최소값      Int max = -999999999 또는 Interger.MIN_VALUE    | MAX_VALUE 최대값
		int[] arr = { 0, 5, 3, 8, 2 };
			for(int i = 0; i < arr.length; i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			System.out.println(max);
			}

}