package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 내용 : 수행평가 1번
 * 
 */
public class _01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int a=0; a<n; a++) {
			for (int b=0; b<=a; b++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

}
