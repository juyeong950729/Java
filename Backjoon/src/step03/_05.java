package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 날짜 : 2022/09/01
 * 이름 : 조주영
 * 내용 : 백준 3단계 5번 문제, A+B
 * 
 */
public class _05 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer s;
		int t = Integer.parseInt(r.readLine());
		int a;
		
		
		for (a=0; a<t; a++) {
			s = new StringTokenizer(r.readLine());
			w.write((Integer.parseInt(s.nextToken())
					+Integer.parseInt(s.nextToken()))+
					"\n");
		}
		
		w.close();
		

		
	}


}
