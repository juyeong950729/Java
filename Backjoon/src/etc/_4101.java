package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/16
 * 이름 : 조주영
 * 내용 : 백준 4101번 문제, 크냐?
 * 
 */
public class _4101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a+b;
			
			if (a > b) {
				System.out.println("Yes");
			}	else if (c == 0) {
					break;
			} else if (a <= b) {
				System.out.println("No");
		} 
	}
	}
}
