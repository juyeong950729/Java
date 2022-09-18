package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 조주영
 * 내용 : 백준 3단계 9번 문제, 별 찍기 - 2
 * 
 */
public class _09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a;
		int b;
		int c;
		
		for (a = 0; a < n; a++) {
			
			for (b = n-1; b > a; b--) {
				System.out.print(" ");
			}
			
			for (c = 0; c <= a; c++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		}
		
		
	}
	
}
