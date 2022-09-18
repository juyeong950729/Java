package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/16
 * 이름 : 조주영
 * 내용 : 백준 4892번 문제, 숫자 맞추기 게임
 * 
 */
public class _4892 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int count = 0;
		
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			
			if (n == 0) {
				break;
			} 
			
			else {
				
				count++;
				System.out.print(count+". ");
				n1 = n * 3;
				
				if (n1 % 2 == 0) {
					System.out.print("even");
					n2 = n1/2;
					n3 = n2*3;
					n4 = n3/9;
					System.out.println(" "+n4);
				} if (n1 % 2 == 1) {
					System.out.print("odd");
					n2 = (n1+1)/2;
					n3 = n2*3;
					n4 = n3/9;
					System.out.println(" "+n4);
				}
				
			}
		}
		
	}

}
