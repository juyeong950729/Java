package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 조주영
 * 내용 : 백준 3단계 13번 문제, 더하기 사이클
 * 
 */
public class _13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		int n2 = n;
		
		do {
			n = (((n%10)*10) + (((n/10)+(n%10))%10));
			count++;
		} while (n2 != n);
		
		System.out.println(count);
		sc.close();
	}

}
