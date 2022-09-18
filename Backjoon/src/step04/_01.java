package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 조주영
 * 내용 : 백준 4단계 1번 문제, 최소, 최대
 * 
 */
public class _01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int length;
		int arr1[] = new int[n];
		int a;
		
		for (length = 0; length < n; length++) {
			arr1[length] = a = sc.nextInt();
		}
		
		int maxnum = arr1[0];
		int minnum = arr1[0];
		int i;
		int j;
		
		for (i = 0; i < n; i++) {
			if (maxnum > arr1[i]) {
				maxnum = arr1[i];
			}
		}
		
		for (j = 0; j < n; j++) {
			if (minnum < arr1[j]) {
				minnum = arr1[j];
			}
		}
		
		System.out.print(maxnum);
		System.out.print(" "+minnum);
		
		sc.close();
	}

}
