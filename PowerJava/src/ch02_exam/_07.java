package ch02_exam;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 문제
 * 	상점에 가면 우리는 상품에 대한 돈을 내고 영수증을 받는다. 영수증에는 10% 부가세와 잔돈 등이 인쇄되어 있다.
 *  구입한 상품의 가격과 손님한테 받은 금액을 입력하면 부가세와 잔돈을 출력하는 프로그램을 작성하여 보자.
 * 
 */
public class _07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("받은 돈: ");
		int a = sc.nextInt();
		System.out.print("상품 가격: ");
		int b = sc.nextInt();
		
		int c = b / 10;
		int d = a - b;
		
		System.out.println("부가세: " + c);
		System.out.println("잔돈: " + d);
		
		
		
	}

}
