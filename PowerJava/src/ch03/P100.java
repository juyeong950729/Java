package ch03;
/*
 * 날짜 : 2022/09/11
 * 이름 : 조주영
 * 내용 : 정수의 합 계산하기
 * 
 */
public class P100 {
	public static void main(String[] args) {
		int sum = 0;
				
		for (int i=1; i<=10; i++)
			sum += i;
		
		System.out.println("1부터 10까지 정수의 합 ="+sum);
	}

}
