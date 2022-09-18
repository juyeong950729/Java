package step01;

import java.util.Scanner;



public class _10 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		int c = 2;
		int d = 2;
		int e = 2;
		int f = 8;
		
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		int d1 = sc.nextInt();
		int e1 = sc.nextInt();
		int f1 = sc.nextInt();
		
		int a2 = a-a1;
		int b2 = b-b1;
		int c2 = c-c1;
		int d2 = d-d1;
		int e2 = e-e1;
		int f2 = f-f1;
		
		System.out.print(a2+" ");
		System.out.print(b2+" ");
		System.out.print(c2+" ");
		System.out.print(d2+" ");
		System.out.print(e2+" ");
		System.out.print(f2);
		
		sc.close();
	}

}
