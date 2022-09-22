package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/22
 * 이름 : 조주영
 * 내용 : 백준 11367번 문제, Report Card Time
 * 
 */
public class _11367 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String name, grade;
		int score;
		
		for (int i=1; i<=n; i++) {
			name = sc.next();
			score = sc.nextInt();
			
			if (score >= 97) {
				grade = "A+";
			} else if (score >= 90) {
				grade = "A";
			} else if (score >= 87) {
				grade = "B+";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 77) {
				grade = "C+";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 67) {
				grade = "D+";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			
			System.out.print(name+" ");
			System.out.println(grade);
		}
		
		
	}

}
