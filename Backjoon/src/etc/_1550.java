package etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/15
 * 이름 : 조주영
 * 내용 : 백준 1550번 문제, 16진수
 * 
 */
public class _1550 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.next();
		List<Integer> arr1 = new ArrayList<>();
		
		arr1.add((int) num1.charAt(0));
		arr1.add((int) num1.charAt(1));
		arr1.add((int) num1.charAt(2));
		arr1.add((int) num1.charAt(3));
		arr1.add((int) num1.charAt(4));
		arr1.add((int) num1.charAt(5));
		
		System.out.println(arr1);
		
		
		
		
		
	}

}
