package sub01;
/*
 * 날짜 : 2022/08/19
 * 이름 : 조주영
 * 내용 : 자바 연산자 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		int result = 0;
		int num = 1;
		num += result;
				
		
		result = num++;
		System.out.println("result : "+result);
		
		result = ++num;
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
	}

}
