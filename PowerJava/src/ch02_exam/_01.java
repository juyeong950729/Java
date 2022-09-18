package ch02_exam;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 문제
 * 	하나의 상자에 오렌지를 10개씩 담을 수 있다고 하자. 오렌지가 127개가 있다면
 * 	상자 몇 개가 필요한가? 또 몇 개의 오렌지가 남을까?
 * 
 */
public class _01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		int a = sc.nextInt();
		
		int b = a/10;
		int c = a%10;
		
		System.out.println(b + "박스가 필요하고 "+c+"개가 남습니다.");
		
	}

}
