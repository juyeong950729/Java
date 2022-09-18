package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/25
 * 이름 : 조주영
 * 내용 : 백준 2단계 4번 문제, 사분면 고르기
 * 
 */
public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 >= 0 && num2 >= 0) {
			System.out.println("1");
		}
		else if (num1 >= 0 && num2 <= 0) {
			System.out.println("4");
		}
		else if (num1 <= 0 && num2 <= 0) {
			System.out.println("3");
			}
		else {
			System.out.println("2");
				}
		sc.close();
	}

}
