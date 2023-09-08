package day14.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<Integer> qu = new LinkedList<>();
		qu.add(1);
		qu.offer(2);
		qu.add(3);
		qu.add(4);
		
		System.out.println(qu.toString()); // 1,2,3,4
		System.out.println(qu.remove(2));  // 2 사라짐
		System.out.println(qu.toString()); // 1,3,4
		
		while(!qu.isEmpty()) {
			System.out.println(qu.poll()); //1,3,4
		}
		
	}

}
