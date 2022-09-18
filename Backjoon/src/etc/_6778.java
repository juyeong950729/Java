package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/18
 * 이름 : 조주영
 * 내용 : 백준 6778번 문제, Which Alien?
 * 
 */
public class _6778 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int an = sc.nextInt();
		int eye = sc.nextInt();
		
		if (an >= 3 && eye <=4)
			System.out.println("TroyMartian");
		
		if (an <= 6 && eye >= 2)
			System.out.println("VladSaturnian");
		
		if (an <= 2 && eye <= 3)
			System.out.println("GraemeMercurian");
		
		
	}

}
