package ch02_exam;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 문제
 *  마일을 킬로미터로 변환하는 프로그램을 작성하라. 1마일은 1.609킬로미터와 같다.
 *  사용자로부터 마일의 값을 읽어 들인다.
 * 
 */
public class _02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오: ");
		double a = sc.nextDouble();
		
		double b = a * 1.609;
		
		System.out.println(a+"마일은 "+b+"킬로미터입니다.");
		
		
	}

}
