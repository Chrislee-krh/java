package day14.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
			
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("hello");
		ts.add("java");
		ts.add("aaa");
		ts.add("computer");
		ts.add("get");
		ts.add("monitor");
		
		for(String str : ts) System.out.print(str+"\t"); 	// aaa computer hello java 순으로 트리구조로 
															// 작은 게 좌측, 큰 게 우측으로 들어간 상태
															// root: hello, internal: aaa, java, leaf: computer, monitor
	}

}
