package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 조주영
 * 내용 : 백준 2단계 7번 문제, 주사위 세개
 * 
 */
public class _07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte num1 = sc.nextByte();
		byte num2 = sc.nextByte();
		byte num3 = sc.nextByte();
		
		int sum1 = num1 * 1000 + 10000;
		int sum2 = num1 * 100 + 1000;
		int sum3 = num2 * 100 + 1000;

		
		if (num1 == num2 && num2 == num3 && num1 == num3) {
			System.out.println(sum1);
		}else if (num1 != num3 && num2 != num3 && num1 == num2) {
			System.out.println(sum2);
		}else if (num2 != num1 && num3 != num1 && num3 == num2) {
			System.out.println(sum3);
		}else if (num1 != num2 && num3 != num2 && num1 == num3) {
			System.out.println(sum2);
		}
		else if (num1 > num2 && num1 > num3) {
			System.out.println(num1*100);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println(num2*100);
		}else if (num3 > num2 && num3 > num1) {
			System.out.println(num3*100);
		}
		
		sc.close();
	}
	
}
