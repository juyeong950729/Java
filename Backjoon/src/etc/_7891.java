package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/18
 * 이름 : 조주영
 * 내용 : 백준 7891번 문제, Can you add this?
 * 
 */
public class _7891 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i=1; i<=t; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1+num2);
		}
		
	}

}
