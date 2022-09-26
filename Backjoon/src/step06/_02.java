package step06;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/26
 * 이름 : 조주영
 * 내용 : 백준 6단계 2번 문제, 숫자의 합
 * 
 */
public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		String num = sc.next();
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			arr1[i] = num.charAt(i);
			System.out.println(num.charAt(i));
		}
		
		System.out.println(sum);
	}

}
