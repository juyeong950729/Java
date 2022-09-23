package etc;

import java.util.Scanner;

public class _14038 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int k = 0;
		
		for (int i=1; i<=t; i++) {
			int n = sc.nextInt();
			k = n*n;
			System.out.println(k);
		}
	}
	
}
