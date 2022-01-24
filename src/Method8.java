/**
 * 계산기 프로그램을 작성하시오. 임의의 두수를 입력받아 + - * / % 를 수행하시오.
 * 
 * @author smart17
 *
 */

public class Method8 {

	public static void main(String[] args) {
		int i = 12;
		int j = 2;
		int res = 0;
		// double res2 = 0.;   => 실수

		res = add(i, j); // 더하기
		System.out.println(i + "+" + j + "=" + res);
		res = minus(i, j); // 빼기 
		System.out.println(i + "-" + j + "=" + res);
		res = multiply(i, j); // 곱하기
		System.out.println(i + "*" + j + "=" + res);
		res = divide(i, j); // 나누기
		//res2를 넣으면 실수값으로 나옴
		System.out.println(i + "/" + j + "=" + res);
		res = remainder(i, j); // 나머지
		System.out.println(i + "%" + j + "=" + res);
	}

	public static int add(int i, int j) {
		return i + j;
	}

	public static int minus(int i, int j) {
		return i - j;
	}

	public static int multiply(int i, int j) {
		return i * j;
		
	}

	public static int divide(int i, int j) {
				//int를 double로
		return i / j;
		//return double i / j; -> 실수나옴.
	}

	public static int remainder(int i, int j) {
		return i % j;
	}

}
