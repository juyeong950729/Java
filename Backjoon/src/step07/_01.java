package step07;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/27
 * 이름 : 조주영
 * 내용 : 백준 7단계 1번 문제, 손익분기점
 * 
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		long price = sc.nextLong();
		int count = 1;
		
		long sum = num1 + (num2 * count);
		price = price * count;
		
		
		if (num2 >= price) {
			System.out.println(-1);
		}
		else {
			if (sum <= price) {
				count++;
			}
			else {
				System.out.println(count);
			}
		}
		
	}

}
