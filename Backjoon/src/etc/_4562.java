package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/16
 * 이름 : 조주영
 * 내용 : 백준 4562번 문제, No Brainer
 * 
 */
public class _4562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a < b) {
				System.out.println("NO BRAINS");
			} else {
				System.out.println("MMM BRAINS");
			}
			
		}
		
		
		
	}

}
