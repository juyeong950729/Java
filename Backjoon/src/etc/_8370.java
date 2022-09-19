package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/19
 * 이름 : 조주영
 * 내용 : 백준 8370번 문제, Plane
 * 
 */
public class _8370 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		
		int a = a1*a2;
		int b = b1*b2;
		int sum = a+b;
		
		System.out.println(sum);
		
	}

}
