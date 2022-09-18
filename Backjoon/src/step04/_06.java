package step04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 내용 : 백준 4단계 6번 문제, 평균은 넘겠지
 * 
 */
public class _06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		double sum = 0;
		double avg = 0;
		
		for (int i=0; i<=c; i++) {
			int n = sc.nextInt();
			for (int j=0; j<=n; j++) {
				double score = sc.nextDouble();
				sum += score;
			}
			avg = sum / n;
			System.out.println(Math.round(avg));
		}
		
	}

}
