package Ch07;
/*
 * 날짜 : 2022/08/26
 * 이름 : 조주영
 * 내용 : 이차원 배열 초기화하기
 * 
 */
public class P220 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			
			System.out.println();
		}
		
	}

}
