package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/24
 * 이름 : 조주영
 * 내용 : 백준 1단계 12번 문제, 곱셈
 * 
 */
public class _12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		String num2 = sc.next();
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		System.out.println(sum1 = num1*(num2.charAt(2)-'0'));
		System.out.println(sum2 = num1*(num2.charAt(1)-'0'));
		System.out.println(sum3 = num1*(num2.charAt(0)-'0'));
		System.out.println(sum3*100 + sum2*10 + sum1);
		
		sc.close();
	}
}
