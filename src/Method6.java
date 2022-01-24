
public class Method6 {

	public static void aaa(int i, char j) {
		System.out.println("aaa()함수가 호출되었습니다." + (++i));
		return;
		// System.out.println();
		// return 밑에는 실행이 안됨
	}
	//static 은 static 이다.
	//다 같은 영역에 들어와있다.
	private static int bbb(int i) {
		i += 1;
		i = i + 1;
		i++;
		return i;

	}

	public static void main(String[] args) {
		int i = 24;
		i = bbb(i);
		// i = 을 해서 값을 대입해주면 27, 없으면 24. 
		System.out.println(i);

	}

}
