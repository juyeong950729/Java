package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/01
 * 이름 : 조주영
 * 내용 : 백준 3단계 8번 문제, 별 찍기 - 1
 * 
 */
public class _08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = 0;
		int num3 = 0;
		
		for (num2=0; num2<num1; num2++) {
			for (num3=0; num3<=num2; num3++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		}
		
	}

}
