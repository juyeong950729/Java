package sub01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 조주영
 * 내용 : 연습문제 4번
 */
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade;
		
		System.out.println("입력한 점수는 "+score+"입니다.");
		
		if (score >= 90 && score <= 100) {
			grade = 'A';
		} else if(80 <= score && score <= 89) {
			grade = 'B';
		} else if(70 <= score && score <= 79) {
			grade = 'C';
		} else if(60 <= score && score <= 69) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("등급은 %c입니다." , grade);
		
		sc.close();
	}

}
