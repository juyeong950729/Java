package step06;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/27
 * 이름 : 조주영
 * 내용 : 백준 6단계 4번 문제, 문자열 반복
 * 
 */
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i=1; i<=t; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			for (int j=0; j<=r; j++) {
					System.out.print(s.charAt(j));
			}
			System.out.print("\n");
		}
	}

}
