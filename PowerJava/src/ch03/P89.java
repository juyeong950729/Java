package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/08
 * 이름 : 조주영
 * 내용 : 짝수와 홀수 구별하기
 * 
 */
public class P89 {
	
	public static void main(String[] args) {
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		number = sc.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("입력된 정수는 짝수입니다.");
		} else {
			System.out.println("입력된 정수는 홀수입니다.");
		}
	}

}
