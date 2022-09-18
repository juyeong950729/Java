package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 조주영
 * 내용 : 백준 3단계 1번 문제, 구구단
 * 
 */
public class _01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int i = 0;
		
		for (i=1; i<=9; i++) {
			System.out.println(num1+" * "+i+" = "+num1*i);
		}
		sc.close();
	}

}
