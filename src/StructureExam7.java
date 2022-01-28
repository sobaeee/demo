/**
 * 함수
 * 성적처리프로그램
 * @author smart17
 */
class Person{
	//멤버변수, 필드
	String name;
	int age;
	String address;
}


public class StructureExam7 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 30;
		p1.address = "서울시 용산구 한남동";
		System.out.printf("이름: %s%n", p1.name);
		System.out.printf("나이: %d%n", p1.age);
		System.out.printf("주소: %s", p1.address);
		
	}

}
