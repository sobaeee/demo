/**
 * 
 * 함수
 * 성적처리프로그램
 * @author smart17
 *
 */
public class StructureExam6 {
	//멤버변수, 필드 
	String stdName;
	int coding;

	public static void main(String[] args) {
		StructureExam6 se0 = new StructureExam6();
		se0.stdName = "홍길동";
		se0.coding = 100;
		print(se0);
		
		
		StructureExam6 se1 = new StructureExam6();
		se1.stdName = "안명진";
		se1.coding = 90;
		print(se1);
		
		StructureExam6 se2 = new StructureExam6();
		se2.stdName = "이순신";
		se2.coding = 80;
		print(se2);
	}

	private static void print(StructureExam6 se0) {
							//↑타입겸 변수명     ↑ 한가지를 지칭 것이 아님 (0을 없애거나 다른 숫자를 붙여도 똑같이 3개가 나옴)
		System.out.println(se0.stdName + "의 코딩성적은 " +se0.coding + "점 입니다.");
	}

}
