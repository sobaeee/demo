/**
 * 성적처리프로그램
 * @author smart17
 *
 */
public class StructureExam3 {
	//멤버변수, 필드 
	String stdName;
	int coding;

	public static void main(String[] args) {
		StructureExam3 se0 = new StructureExam3();
		se0.stdName = "홍길동";
		se0.coding = 100;
		System.out.println(se0.stdName + "의 코딩성적은 " +se0.coding);
		
		StructureExam3 se1 = new StructureExam3();
		se1.stdName = "안명진";
		se1.coding = 90;
		System.out.println(se1.stdName + "의 코딩성적은 " +se1.coding);
		
		StructureExam3 se2 = new StructureExam3();
		se2.stdName = "이순신";
		se2.coding = 80;
		System.out.println(se2.stdName + "의 코딩성적은 " +se2.coding);
	}

}
