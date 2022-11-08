package etc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr1[] = new int[n];
		
		for (int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		int count = 0;
		
		for (int j=0; j<n; j++) {
			if (arr1[j] == v) {
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}
}
