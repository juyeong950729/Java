package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 조주영
 * 내용 : 백준 3단계 12번 문제, A+B -4
 * 
 */
public class _12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			
			System.out.println(c);
		}
		sc.close();
	}

}
