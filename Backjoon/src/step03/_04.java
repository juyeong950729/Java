package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/01
 * 이름 : 조주영
 * 내용 : 백준 3단계 4번 문제, 영수증
 * 
 */
public class _04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		int c = 1;
		int d = 0;
		
		while (c <= N) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			d += a*b;
			c++;
		} if (X==d) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
