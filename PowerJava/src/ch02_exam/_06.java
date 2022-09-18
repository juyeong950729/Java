package ch02_exam;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 문제
 * 	사용자로부터 파일이 위치한 드라이브 이름(c), 디렉터리 이름(\test\),
 *  파일이름(sample), 확장자(py)를 받아서 완전한 파일 이름(c:\test\sample.py)으로
 *  만드는 프로그램을 작성해보자.
 * 
 */
public class _06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("드라이브 이름: ");
		String a = sc.next();
		
		System.out.print("디렉터리 이름: ");
		String b = sc.next();
		
		System.out.print("파일 이름: ");
		String c = sc.next();
		
		System.out.print("확장자: ");
		String d = sc.next();
		
		System.out.println("완전한 이름은 "+a+":"+b+c+"."+d);
		
	}

}
