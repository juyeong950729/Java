package step06;

import java.util.Scanner;

/*
 * 날짜 : 2022/11/28
 * 이름 : 조주영
 * 내용 : 백준 6단계 7번 문제, 상수
 * 
 */
public class _07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a1 = (num1 - (num1 % 100)) / 100;
		int a2 = (num1 - (a1*100)) / 10;
		int a3 = num1 % 10;
		int b1 = (num2 - (num2 % 100)) / 100;
		int b2 = (num2 - (b1*100)) / 10;
		int b3 = num2 % 10;
		
		num1 = a1 + (a2 * 10) + (a3 * 100);
		num2 = b1 + (b2 * 10) + (b3 * 100);
		
		
		if (num1 >= num2) {
			System.out.println(num1);
		} else if (num2 > num1) {
			System.out.println(num2);
		} 
		
		
	}

}
