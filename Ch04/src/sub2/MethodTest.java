package sub2;
/* 
 * 날짜 : 2022/08/23
 * 이름 : 조주영
 * 내용 : Java 메서드 실습하기
 * 
 * 메서드 (Method)
 * 	- 자주 사용하는 코드로직을 모듈화한 구조체
 * 	- 메서드에서 선언한 변수는 지역변수이고 해당 메서드가 종료되면 메모리에서 소멸
 * 
 */
public class MethodTest {
	
	// 전역변수
	int num = 1;
	
	
	public static void main(String[] args) {
		
		// 메서드 호출
		int r1 = f(1);
		int r2 = f(2);
		int r3 = f(3);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		// 메서드 지역변수와 스택
		
		int t1 = sum(1, 10);	// 1과 10은 argument-인자값
								//아래 start와 end는 parameter-파라미터
		int t2 = sum(1, 100);
		
		System.out.println("t1 : "+t1);
		System.out.println("t2 : "+t2);
		
		
		
		
	} //main end
	
	// 메서드 정의
	public static int f(int x) { //메서드 이름은 소문자로 시작해야함 여기서는 f
		
		int y = 2 * x + 3;
		
		return y;
		
	}
	
	// 메서드 정의
	public static int sum(int start, int end) {
		// 지역변수
		
		int total = 0;
		
		for(int k=start; k<=end; k++) {
			total += k;
		}
		
		return total;
		
	}

}
