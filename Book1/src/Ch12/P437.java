package Ch12;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2022/09/20
 * 이름 : 조주영
 * 내용 : Comparator 인터페이스 사용하기
 * 
 */
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1;
	}
	
}

public class P437 {
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
	}

}
