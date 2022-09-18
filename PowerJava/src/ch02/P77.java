package ch02;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 내용 : 섭씨-화씨 온도 변환
 * 
 */
public class P77 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================");
		System.out.println("1. 화씨->섭씨");
		System.out.println("2. 섭씨->화씨");
		System.out.println("=====================");
		System.out.println(" ");
		System.out.print("번호를 선택하시오: ");
		byte a = sc.nextByte();
		
		if (a == 1) {
			System.out.print("화씨온도를 입력하시오: ");
			double f = sc.nextDouble();
			double f1 = (f-32) * 5/9;
			System.out.println("섭씨온도는 "+f1);
		} else if (a == 2) {
			System.out.print("섭씨온도를 입력하시오: ");
			double c = sc.nextDouble();
			double c1 = (9/5 * c) + 32;
			System.out.println("화씨온도는 "+c1);
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		sc.close();
		
	}

}
