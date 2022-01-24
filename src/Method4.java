
public class Method4 {
	
	public static void aaa(int i) {
		System.out.println("aaa()함수가 호출되었습니다." + (++i));
		
	}
	
	public static void main(String[] args) {
		int i = 24;
		aaa(i);
		System.out.println(i);
		// 위쪽 중괄호로 닫혀 있어서 아래는 24로 유지
		
		// aaa(i) -> 24를 넣어도 4번째줄 int i에 자동으로 대입 돼서 24로 나옴 

	}

}
