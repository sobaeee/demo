/**
 * 주어진 배열의 항목에서 최대값을 구해보세요. (for문을 이용하세요.) 
 * {0, 5, 3, 8, 2} 
 * 결과값은 8
 * 
 * @author smart17
 *
 */
public class ArrayExam13 {

	public static void main(String[] args) {
		int max = 0;
		//최소값      Int max = -999999999 또는 Interger.MIN_VALUE    | MAX_VALUE 최대값
		int[] arr = { 0, 5, 3, 8, 2 };
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				//arr[i] ->arr[] 첫번째 칸의 값 
				//i가 오면 모든 수가 자동으로 돈다.
			}
		} 
		System.out.println(max);
			
			}

}