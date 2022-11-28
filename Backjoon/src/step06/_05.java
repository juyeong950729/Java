package step06;

import java.util.Scanner;

/*
 * 날짜 : 2022/11/28
 * 이름 : 조주영
 * 내용 : 백준 6단계 5번 문제, 단어 공부
 * 
 */
public class _05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[26];
		
		String n = sc.next();
		byte n1;
		
		for (int i=0; i<n.length(); i++) {
			n1 = (byte) n.charAt(i);
			if (n1 >= 65 && n1 <=90) {
				arr1[n.charAt(i) - 'A']++;
			} else {
				arr1[n.charAt(i) - 'a']++;
			}
		}
		
		int max = -1;
		char s = '?';
		
		for (int i=0; i<26; i++) {
			if(arr1[i] > max) {
				max = arr1[i];
				s = (char) (i+65);
			} else if (arr1[i] == max) {
				s = '?';
			}
		}
		
		System.out.println(s);
	}

}
