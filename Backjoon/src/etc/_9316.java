package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/19
 * 이름 : 조주영
 * 내용 : 백준 9316번 문제, Hello Judge
 * 
 */
public class _9316 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Hello World, ");
			System.out.print("Judge "+i);
			System.out.print("!");
			System.out.println();
		}
		
	}

}
