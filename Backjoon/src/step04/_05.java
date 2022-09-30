package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/30
 * 이름 : 조주영
 * 내용 : 백준 4단계 5번 문제, OX퀴즈
 * 
 */
public class _05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			String s = sc.next();
			
			int count = 0;
			int sum = 0;
			for (int j=0; j<s.length(); j++) {
				if (s.charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			
			System.out.println(sum);
		}
		
		
		}
		
	
}
