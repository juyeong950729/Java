package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 조주영
 * 내용 : 백준 3단계 11번 문제, A+B -5
 * 
 */
public class _11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			
			if (c != 0) {
			System.out.println(c);
			}
			
			if (c == 0) {
				break;
			}
			
		} 
		
		sc.close();
		
	}

}
