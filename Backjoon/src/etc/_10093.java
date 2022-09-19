package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/19
 * 이름 : 조주영
 * 내용 : 백준 10093번 문제, 숫자
 * 
 */
public class _10093 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c, d;
		
		if (a == b) {
			c = 0;
			System.out.println("0");
		} else if (a >= b) {
			c = a-b-1;
			System.out.println(c);
			for (int i=0; i<c; i++) {
				d = b+i+1;
				System.out.print(d+" ");
			}
		} else if (a <= b) {
			c = b-a-1;
			System.out.println(c);
			for (int i=0; i<c; i++) {
				d = a+i+1;
				System.out.print(d+" ");
			}
		}
		
		
	}

}
