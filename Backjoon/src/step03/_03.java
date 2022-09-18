package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 조주영
 * 내용 : 백준 3단계 3번 문제, 합
 * 
 */
public class _03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		int i1 = 0;
		
		for(i=0; i<=n; i++) {
			i1 += i;
			
		}
		System.out.println(i1);
		
		sc.close();
	}

}
