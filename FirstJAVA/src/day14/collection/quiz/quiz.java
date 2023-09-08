package day14.collection.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class quiz {

	// ArrayList1: [1,2,3,4,5,6]
	// ArrayList2: [4,5,6,7,8,9]
	
	// 두집합의 합/교/차 집합을 출력
	// 합: 123456789
	// 교: 456
	// 차: 123, 789
	
	public static void main(String[] args) {
		String num1 = null;
		String num2 = null;
		String num3 = null;
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		
		//교집합
		for(int i = 0; i<list1.size(); i++) {
			for(int j = 0; j<list2.size();j++) {
				if(list1.get(i)==list2.get(j)) {
					num1 = list2.get(j).toString();
					System.out.print("교집합: " + num1 + "\t");
					
				}
				
			}
			
		}
		
		
			
	}
}
				
		//합집합		
		
		
			
			
					
//		Set<Integer> ArrayList3 = new TreeSet<Integer>();
//		
//		list1.addAll(list2);
//		ArrayList3.addAll(list1);
//		
//		System.out.println("합집합: " + ArrayList3);
		
	
		
					
		
		
		
		
	
	


