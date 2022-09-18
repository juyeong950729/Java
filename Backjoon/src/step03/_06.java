package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/01
 * 이름 : 조주영
 * 내용 : 백준 3단계 6번 문제, A+B -7
 * 
 */
public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int c;
		
		for (c=1; c<=T; c++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = a+b;
			
			System.out.println("Case #"+ c +": "+ d);
		}
		
		sc.close();
	}

}
