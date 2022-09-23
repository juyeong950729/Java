package sub2;
/*
 * 날짜 : 2022/09/07
 * 이름 : 조주영
 * 내용 : 수행평가 4번
 * 
 */
public class _04 {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		
		for (a=0; a<4; a++) {
			for (b=3; b>a; b--) {
				System.out.print("☆");
			} for (b=0; b<a*2+1; b++) {
				System.out.print("★");
			  } for (b=3; b>a; b--) {
				System.out.print("☆");
			    }System.out.print("\n");
			
		} 
		
	}

}
