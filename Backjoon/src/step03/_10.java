package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 조주영
 * 내용 : 백준 3단계 10번 문제, X보다 작은 수
 * 
 */
public class _10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int a = 0;
		
		int [] arr1 = new int[n];
		
		for (int i=0; i<arr1.length; i++) {
			arr1[i] = a = sc.nextInt();
		}
			
		for (int i=0; i<arr1.length; i++) {
			if (arr1[i] < x) {
				System.out.print(arr1[i]+" ");
			}
		}
		
		sc.close();
		
	}

}
