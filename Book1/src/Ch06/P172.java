package Ch06;

class Person {
	String name;
	int age;
	
	Person() {
		this ("이름 없음" , 1);
	}
	
	Person (String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	Person returnItSelf() {
		return this; // this 반환
	}

}

public class P172 {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();	// this값 클래스 변수에 대입
		System.out.println(p);				// noName.returnItself()의 반환 값 출력
		System.out.println(noName);			// 참조 변수 출력
	}
}

