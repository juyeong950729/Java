package step04;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 내용 : 백준 4단계 3번 문제, 나머지
 * 
 */
public class _03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<>();
		
		for (int i=0; i<=9; i++) {
			int a = sc.nextInt() % 42;
			hs.add(a);
		}
		
		System.out.println(hs.size());
	}

}
