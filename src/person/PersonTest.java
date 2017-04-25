package person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		//private은 외부에서 접근 불가
		//p.name = "권성훈";
		p.age = 10;
		//protected는 자식 or 같은 패키지에서 접근 가능
	}
}
