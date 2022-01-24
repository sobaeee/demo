/**
 * 문자열 String 클래스
 * @author smart17
 *
 */
public class StringExam {

	public static void main(String[] args) {
		String str = new String("ABC");
		String str2 = new String("ABC");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		// str 와 str2의 값이 같냐.|  == <사용 x  |  equals를 사용해서 비교함.
		System.out.println(str);
		System.out.println(str2);
	}

}
