package ch03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/11
 * 이름 : 조주영
 * 내용 : 약수 계산하기
 * 
 */
public class P101 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오: ");
		int n = scan.nextInt();
		
		System.out.println(n + "의 약수는 다음과 같습니다.");
		for (int i=1; i<=n; ++i) {
			if (n%i == 0)
				System.out.print(" " + i);
		}
		
	}

}
