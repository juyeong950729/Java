package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/19
 * 이름 : 조주영
 * 내용 : 백준 9713번 문제, Sum of Odd Sequence
 * 
 */
public class _9713 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int sum = 0;
		
		for (int i=1; i<=t; i++) {
			int n = sc.nextInt();
			for (int j=0; j<=n; j++) {
				if (j == 1) {
					sum = j;
				} else if (j % 2 == 0) {
					continue;
				} else if (j % 2 == 1) {
					sum += j;
				}
				
			}
			System.out.println(sum);
		}
		
	}

}
