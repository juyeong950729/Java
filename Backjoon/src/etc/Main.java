package etc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int arr1[] = new int[31];
		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i<29; i++) {
			int j = sc.nextInt();
			arr1[j] = 1;
		}
		
		for (int i=1; i<arr1.length; i++) {
			if(arr1[i] != 1) {
				System.out.println(i);
			}
		}
		
		
	}
}
