package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/22
 * 이름 : 조주영
 * 내용 : 백준 11549번 문제, Identifying tea
 * 
 */
public class _11549 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tea = sc.nextInt();
		int person;
		int count = 0;
		
		for (int i=1; i<=5; i++) {
			person = sc.nextInt();
			
			if (person == tea) {
				count++;
			} else {
				continue;
			}
		}
		
		System.out.println(count);
		
		
	}

}
