 package ch02_exam;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 문제
 * 	사용자로부터 두 개의 정수를 받아서 정수의 합, 정수의 차, 정수의 곱, 정수의 평균,
 *  큰 수, 작은 수를 계산하여 화면에 출력하는 프로그램을 작성하라.
 *  큰 수와 작은 수를 구할 때는 조건 연산자를 사용해보자.
 * 
 */
public class _03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x: ");
		int x = sc.nextInt();
		System.out.print("y: ");
		int y = sc.nextInt();
		
		System.out.println("두 수의 합: "+ (x+y));
		System.out.println("두 수의 차: "+ (x-y));
		System.out.println("두 수의 곱: "+ (x*y));
		System.out.println("두 수의 평균: "+ ((x+y)/2));
		System.out.print("큰 수: ");
		System.out.print((x > y)? x : y);
		System.out.println();
		System.out.print("작은 수: ");
		System.out.print((x > y)? y : x);
		
	}

}
