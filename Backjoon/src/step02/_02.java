package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/25
 * 이름 : 조주영
 * 내용 : 백준 2단계 2번 문제, 시험 성적
 * 
 */

public class _02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		if (num1 >= 90) {
			System.out.println("A");
		}
		
		else if (num1 >= 80 && num1 <= 89) {
			System.out.println("B");
		}
		
		else if (num1 >= 70 && num1 <= 79) {
			System.out.println("C");
		}
		
		else if (num1 >= 60 && num1 <= 69) {
			System.out.println("D");
		}
		
		else {
			System.out.println("F");
		}
		
		
		sc.close();
	}
}
