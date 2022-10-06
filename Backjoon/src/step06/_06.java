package step06;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/10/06
 * 이름 : 조주영
 * 내용 : 백준 6단계 6번 문제, 단어의 개수
 * 
 */
public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str1, " ");
		
		System.out.println(st.countTokens());
		
	}

}
