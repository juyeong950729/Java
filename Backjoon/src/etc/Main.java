package etc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i=1; i<=t; i++) {
			int n = sc.nextInt();
			long n1 = n*n;
			System.out.println(n1);
		}
	}

}
