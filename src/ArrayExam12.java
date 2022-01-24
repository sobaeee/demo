
public class ArrayExam12 {

	public static void main(String[] args) {
		
		int [] i = new int[2];
		int [] j = null;
		j = i;
		//↑ 같은 주소를 공유하게 되어서 똑같이 값이 2가 나온다. 
		
		i[0] = 1;
		j[0] = 2;
		//마지막 값이 나옴 
		i = null;
		//주소를 끊음 
		System.gc();
		//↑안쓰는 것들을 다 자동으로 지워줌
		//System.out.println(i[0]);
		System.out.println(j[0]);
	}
}