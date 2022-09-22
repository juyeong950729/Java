package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/22
 * 이름 : 조주영
 * 내용 : 백준 11104번 문제, Fridge of Your Dreams
 * 
 */
public class _11104 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			String s = sc.next();
			int num = Integer.parseInt(s, 2);
			System.out.println(num);
		}
		
	}

}
