package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/02
 * 이름 : 조주영
 * 내용 : 백준 4단계 2번 문제, 최댓값
 * 
 */
public class _02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int length;
		int arr1[] = new int[9];
		int a;
		
		for (length = 0; length < 9; length++) {
			arr1[length] = a = sc.nextInt();
		}
		
		int maxnum = arr1[0];
		int i;
		int j;
		
		for (i = 0; i < 9; i++) {
			if (maxnum < arr1[i]) {
				maxnum = arr1[i];
			}

		}
		
		System.out.println(maxnum);
		
		for (j = 0; j < 9; j++) {
			if (maxnum == arr1[j]) {
				System.out.println(j+1);
			}
		}
		
		sc.close();

	}

}
