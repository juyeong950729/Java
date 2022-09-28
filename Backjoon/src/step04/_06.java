package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/28
 * 이름 : 조주영
 * 내용 : 백준 4단계 6번 문제, 평균은 넘겠지
 * 
 */
public class _06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		for (int i=0; i<c; i++) {
			
			double sum = 0;
			
			int n = sc.nextInt();
			double[] arr1 = new double[n];
			
			for (int j=0; j<n; j++) {
				arr1[j] = sc.nextDouble();
				sum += arr1[j];
			}
			
			double count = 0;
			double avg = sum / n;
			
			
			for (int k=0; k<n; k++) {
				if (arr1[k] > avg) {
					count++;
				}
			}
			
			double rate = (count / n)*100;
			System.out.printf("%.3f%%\n", rate);
				
		}
		
	}

}
