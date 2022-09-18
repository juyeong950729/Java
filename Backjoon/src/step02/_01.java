package step02;
/*
 * 날짜 : 2022/08/25
 * 이름 : 조주영
 * 내용 : 백준 2단계 1번 문제, 두 수 비교하기
 * 
 */

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println(">");
		}
		if (num2 > num1) {
			System.out.println("<");
		}
		if (num1 == num2) {
			System.out.println("==");
		}
		
		sc.close();
	}
	
	

}
