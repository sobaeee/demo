/**
 * 계산기 프로그램을 작성하시오.
 * 임의의 두수를 입력받아 + - * / % 를 수행하시오.
 * @author smart17
 *
 */

public class Method7 {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		add(i,j); //더하기
		minus(i,j);//빼기
		multiply(i,j);//곱하기
		divide(i,j);//나누기
		remainder(i,j);//나머지

	}
	
	public static void add(int i, int j) {
		System.out.println(i + "+" + j + "=" + (i+j));
	}
	public static void minus(int i, int j) {
		System.out.println(i + "-" + j + "=" + (i-j));
	}
	public static void multiply(int i, int j) {
		System.out.println(i + "*" + j + "=" + (i*j));
	}
	public static void divide(int i, int j) {
		System.out.println(i + "/" + j + "=" + (i/j));
	}
	public static void remainder(int i, int j) {
		System.out.println(i + "%" + j + "=" + (i%j));
	}

}
