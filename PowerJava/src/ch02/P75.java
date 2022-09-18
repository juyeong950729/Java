package ch02;
/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 내용 : 비트 이동 연산자 실습하기
 * 
 */
public class P75 {
	public static void main(String[] args) {
		
		int x = 0b00001101;		//13
		int y = 0b00001010;		//10
		
		System.out.print("x&y=" + (x&y) + "  ");
		System.out.print("x|y=" + (x|y) + "  ");
		System.out.print("x^y=" + (x^y) + "  ");
		System.out.println("~x=" + (~x) + "  ");
		System.out.print("x>>1=" + (x>>1) + "  ");
		System.out.print("x<<1=" + (x<<1) + "  ");
		System.out.println("x>>>1=" + (x>>>1));
	}

}
