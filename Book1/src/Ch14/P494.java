package Ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 날짜 : 2022/09/08
 * 이름 : 조주영
 * 내용 : try-catch문 사용하기 2
 * 
 */
public class P494 {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);  // 예외 클래스의 toString() 메서드 호출
		}
		
		System.out.println("여기도 수행됩니다.");   // 정상 출력
	}

}
