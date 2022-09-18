package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/16
 * 이름 : 조주영
 * 내용 : 백준 5522번 문제, 카드 게임
 * 
 */
public class _5522 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte num1 = sc.nextByte();
		byte num2 = sc.nextByte();
		byte num3 = sc.nextByte();
		byte num4 = sc.nextByte();
		byte num5 = sc.nextByte();
		int sum1 = num1 + num2 + num3 + num4 + num5;
		
		System.out.println(sum1);
		
	}

}
