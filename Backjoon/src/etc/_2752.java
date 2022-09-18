package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/16
 * 이름 : 조주영
 * 내용 : 백준 2752번 문제, 세수정렬
 * 
 */
public class _2752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr1 = new int[3];
		
		arr1[0] = sc.nextInt();
		arr1[1] = sc.nextInt();
		arr1[2] = sc.nextInt();
		
		for (int i=0; i<2; i++) {
			for (int j=i+1; j<3;j++) {
				if (arr1[i] > arr1[j]) {
					int num = arr1[j];
					arr1[j] = arr1[i];
					arr1[i] = num;
				}
			}
		}
		
		for (int n : arr1) {
			System.out.print(n+" ");
		}
		
		
	}

}
