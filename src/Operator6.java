
public class Operator6 {

	public static void main(String[] args) {
		// 증감연산자 ++, --\
		int i = 0;
		System.out.println(++i);
		
		//부정연산자 !
		boolean b = false;
		System.out.println(!b);
		
		//비교연산자 >, >=, <, <=, ==, != 결과는 boolean
		int m = 10, n = 5;
		System.out.println(m > n);
		System.out.println(m >= n);
		System.out.println(m < n);
		System.out.println(m <= n);
		System.out.println(m == n);
		System.out.println(m != n);
		System.out.println("-------------------");
		
		//논리연산자 ( and[&&] , or[||] , not[!])
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println("-------------------");
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println("-------------------");
		System.out.println(!false);
		System.out.println(!true);
		System.out.println("-------------------");
		
		//비트연산자 & | ^ ~ >> >>>
		byte bitNum1 = 15;
		byte bitNum2 = 20;
		System.out.println(bitNum1 + bitNum2);
		System.out.println(bitNum1 & bitNum2);
		System.out.println(bitNum1 | bitNum2);
		System.out.println(bitNum1 ^ bitNum2);
		System.out.println(~bitNum2);
		System.out.println(bitNum2 << 2);
		System.out.println(bitNum2 >> 1);
		System.out.println(bitNum2 >>> 1);
		System.out.println("-------------------");
		
		
		
		
	}

}
