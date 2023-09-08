package day14.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.add(1);
		st.push(2);
		st.add(3);
		st.push(4);
		System.out.println(st.toString()); // [1, 2, 3, 4] 
		System.out.println((st.get(0))); // 1
		System.out.println(st.search(1)); // 4(스택 상으로 맨 아래에 있어서, 위로부터 카운트 1,2,3,4)
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());  // 4321
		}
		
	}

}
