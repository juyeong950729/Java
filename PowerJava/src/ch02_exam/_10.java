package ch02_exam;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 문제
 *  움직이는 물체의 운동에너지를 계산해보자. 물체의 에너지를 계산하는 식은 0.5 x 무게 x 속도제곱이다.
 *  적절한 자료형을 사용한다.
 * 
 */
public class _10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물체의 무게를 입력하시오(킬로그램) : ");
		double k = sc.nextDouble();
		System.out.print("물체의 속도를 입력하시오(미터/초) : ");
		double s = sc.nextDouble();
		
		double energy = 0.5 * k * s * s;
		
		System.out.println("물체는 "+energy+"(줄)의 에너지를 가지고 있다.");
	}

}
