package step06;

import java.util.Scanner;

/*
 * 날짜 : 2022/10/06
 * 이름 : 조주영
 * 내용 : 백준 6단계 3번 문제, 알파벳 찾기
 * 
 */
public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] arr1 = new int[26];
		byte[] arr2 = new byte[s.length()];
		
		for (int i=0; i<=25; i++) {
			arr1[i] = -1;
		}
		
		for (int j=0; j<s.length(); j++) {
			arr2[j] = (byte) (s.charAt(j) - 97);
		}
		
		for (int k=0; k<arr2.length; k++) {
			if (arr1[arr2[k]] == -1) {
				arr1[arr2[k]] = k;
			}
		}
		
		for (int n=0; n<arr1.length; n++) {
			System.out.print(arr1[n]+" ");
		}
		

	}

}
