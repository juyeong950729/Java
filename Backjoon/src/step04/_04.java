package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 내용 : 백준 4단계 4번 문제, 평균
 * 
 */
public class _04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] arr1 = new double[n];
		
		for (int i = 0; i <= n-1; i++) {
			arr1[i] = sc.nextDouble();
		}
		
		int a = 0;
		double max = arr1[0];
		
		for (a = 0; a < n; a++) {
			if (max < arr1[a]) {
				max = arr1[a];
			}
		}
		
		double sum = 0;
		a = 0;
		
		while (a <= n-1) {
			sum += arr1[a];
			a++;
		}
		
		double avg1 = sum / n;
		double avg2 = avg1 / max * 100;
		
		System.out.println(avg2);
		
	}

}
