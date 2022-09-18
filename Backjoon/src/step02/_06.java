package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 조주영
 * 내용 : 백준 2단계 6번 문제, 오븐 시계
 * 
 */
public class _06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte h1 = sc.nextByte();
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		
		int sum1 = m1 + m2;
		
		if (m1+m2 < 60) {
			System.out.print(h1);
			System.out.print(" "+sum1);
		} else if (m1+m2 > 60 && h1+ sum1/60 < 24) {
			System.out.print(h1+sum1/60);
			System.out.print(" "+sum1%60);
		} else {
			System.out.print((h1 +(sum1/60)-24));
			System.out.print(" "+sum1%60);
		}
		
		sc.close();
	}

}
