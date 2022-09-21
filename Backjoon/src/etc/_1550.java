package etc;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/15
 * 이름 : 조주영
 * 내용 : 백준 1550번 문제, 16진수
 * 
 */
public class _1550 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int i = 0;
		String num1 = sc.next();
		int[] arr1 = new int[6];
		
		for (i=0; i<=6; i++) {
			if (num1.charAt(i) <= 0) {
				break;
			}
			arr1[i] = num1.charAt(i);
		}
		
		System.out.println(arr1);
		
		for (int j=0; j<=arr1.length; j++) {
			if (arr1[j] >= 65) {
				arr1[i] = arr1[j]-55;
			}
		}
		
		
		
		
		
	}

}
