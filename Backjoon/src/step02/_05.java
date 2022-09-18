package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/25
 * 이름 : 조주영
 * 내용 : 백준 2단계 5번 문제, 알람 시계
 * 
 */
public class _05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int num1 = M + 15;
		
		if(M >= 45) {
			System.out.print(H);
			System.out.print(" ");
			System.out.print(M-45);
		}
		else if(M < 45 && H >= 1) {
			System.out.print(H-1);
			System.out.print(" ");
			System.out.print(num1);
		}
		else {
			System.out.println("23 " + num1);
		}
		sc.close();
	}

}
