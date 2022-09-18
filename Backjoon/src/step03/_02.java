package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/29
 * 이름 : 조주영
 * 내용 : 백준 3단계 2번 문제, A+B-3
 * 
 */
public class _02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int i;
		
		for (i=1; i<=num1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			System.out.println(c);
		}
		
		sc.close();
	}

}
