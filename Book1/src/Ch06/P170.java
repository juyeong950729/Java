package Ch06;
/*
 * 날짜 : 2022/08/23
 * 이름 : 조주영
 * 내용 : this 출력하기
 * 
 */

class BirthDay {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class P170 {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}

}
