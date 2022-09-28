package step05;
/*
 * 날짜 : 2022/09/28
 * 이름 : 조주영
 * 내용 : 백준 5단계 1번 문제, 정수 N개의 합
 * 
 */

class Test {
    long sum(int[] a) {
        long ans = 0;
        
        for (int i=0; i<a.length; i++){
            ans += a[i];
        }
        return ans;
    }
}

public class _01 {
	public static void main(String[] args) {	
	}
}
