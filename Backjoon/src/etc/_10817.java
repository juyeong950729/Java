package etc;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/19
 * 이름 : 조주영
 * 내용 : 백준 10817번 문제, 세 수
 * 
 */
public class _10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if (num1 == num2 && num2 == num3) {
			System.out.println(num1);
		}
		
		else if (num1 == num2 && num2 != num3) {
			System.out.println(num2);
		}
		
		else if (num1 == num3 && num1 != num2) {
			System.out.println(num1);
		}
		
		else if (num2 == num3 && num1 != num2) {
			System.out.println(num2);
		}
		
		else {
			
			if (num1 >= num2 && num2 >= num3 ) {
				System.out.println(num2);
			} else if (num3 >= num2 && num2 >= num1){
				System.out.println(num2);
			}
			
			else if (num3 >= num1 && num1 >= num2) {
				System.out.println(num1);
			} else if (num2 >= num1 && num1 >= num3) {
				System.out.println(num1);
			}
			
			else if (num2 >= num3 && num3 >= num1 ) {
				System.out.println(num3);
			} else if (num1 >= num3 && num3 >= num2) {
				System.out.println(num3);
			}
			
		}
		
	}

}
