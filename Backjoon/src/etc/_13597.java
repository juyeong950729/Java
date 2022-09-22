package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/22
 * 이름 : 조주영
 * 내용 : 백준 13597번 문제, Tri-du
 * 
 */
public class _13597 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
	}

}
