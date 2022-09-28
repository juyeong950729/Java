package sub07;
/*
 * 날짜 : 2022/09/28
 * 이름 : 조주영
 * 내용 : 자바 총정리 연습문제
 * 
 */
class _Person {
	private String name;
	private int age;
	
	public _Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public _Person() {}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void Hello() {
		System.out.println("------------");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}

class _Student extends _Person{
	private String school;
	private String major;
	
	public _Student (String name, int age, String school, String major) {
		super(name, age);
		this.school = school;
		this.major = major;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public void Hello() {
		super.Hello();
		System.out.println("학교 : " + school);
		System.out.println("전공 : " + major);
	}
}

class _SalaryStudent extends _Student {
	private String company;
	
	public _SalaryStudent(String name, int age, String school, String major, String company) {
		super(name, age, school, major);
		this.company = company;
	}
	
	@Override
	public void Hello() {
		super.Hello();
		System.out.println("회사 : " + company);
	};
}
public class Test06 {
	public static void main(String[] args) {
		_Person kim = new _Person("김유신", 24);
		_Student jang = new _Student("장보고", 26, "부경대", "영문학과");
		_SalaryStudent lee = new _SalaryStudent("이순신", 27, "부산대", "경제학과", "삼성전자");
		
		kim.Hello();
		jang.Hello();
		lee.Hello();
	}

}
