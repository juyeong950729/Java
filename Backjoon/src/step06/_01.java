package step06;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/22
 * 이름 : 조주영
 * 내용 : 백준 6단계 1번, 아스키 코드
 * 
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		byte[] b = s.getBytes();
		
		System.out.println(b[0]);
		
	}

}

