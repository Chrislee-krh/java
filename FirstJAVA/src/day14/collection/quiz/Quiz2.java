package day14.collection.quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Quiz2 {
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {4,5,6,7,8,9};
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
	
		for(int i = 0; i< arr1.length; i++) {
			list1.add(arr1[i]);
			list2.add(arr2[i]);
		}
		
		// 합집합
		ArrayList union = new ArrayList(list1);
		
		for(Object o : list2) {
			if(!union.contains(o)) {
				union.add(o);
			}
		}
		System.out.println(union);
		
		// 교집합
		ArrayList intersect = new ArrayList();
		
		for(Object o: list2) {
			if(list1.contains(o)) {
				intersect.add(o);
			}
		}
		System.out.println(intersect);
		
		
		//차집합
		ArrayList diff1 = new ArrayList(list1);
		
		for(Object o : list2) {
			if(diff1.contains(o)) {
				diff1.remove(o);
			}
		}
		System.out.println(diff1);
		
		ArrayList diff2 = new ArrayList(list2);
		for(Object o : list1) {
			if(diff2.contains(o)) {
				diff2.remove(o);
			}
		}
		System.out.println(diff2);
		
		ArrayList diff = new ArrayList();
		diff.add(diff1);
		diff.add(diff2);
		
		System.out.println(diff);
		
	}
}
