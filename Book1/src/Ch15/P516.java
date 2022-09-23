package Ch15;

import java.io.IOException;

/*
 * 날짜 : 2022/09/23
 * 이름 : 조주영
 * 내용 : 문자 여러 개를 입력받기
 * 
 */
public class P516 {
	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			while ((i = System.in.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
