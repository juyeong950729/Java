package ch02;
/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 내용 : 형변환 실습하기
 * 
 */
public class P62 {
	
	public static void main(String[] args) {
		
		int i;
		double f;
		
		f = 1/5;
		System.out.println(f);
		
		f = (double) 1/5;
		System.out.println(f);
		
		i = (int) 1.7 + (int) 1.8;
		System.out.println(i);
	}

}
