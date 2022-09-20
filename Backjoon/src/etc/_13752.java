package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/20
 * 이름 : 조주영
 * 내용 : 백준 13752번 문제, 히스토그램
 * 
 */
public class _13752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int k = sc.nextInt();
			for (int j=1; j<=k; j++) {
			System.out.print("=");
			}
			System.out.println();
		}
		
	}

}
