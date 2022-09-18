package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/18
 * 이름 : 조주영
 * 내용 : 백준 6810번 문제, ISBN
 * 
 */
public class _6810 {
	public static void main(String[] args) {
		
		int a = 91;
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int num4 = num2*3;
		int sum = a+num1+num3+num4;
		
		System.out.println("The 1-3-sum is "+sum);
		
	}

}
