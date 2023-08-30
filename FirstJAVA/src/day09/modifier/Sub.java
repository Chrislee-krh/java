package day09.modifier;

import day09.modifier.pac.Super;

public class Sub extends Super {
	private int num5 = 50;
	
	public void print() {
		System.out.println("Super num1 = " + num1);
		System.out.println("Super num2 = " + num2);
//		System.out.println("Super num3 = " + num3); // Error 접근 제한자 default 
//		System.out.println("Super num4 = " + num4); // private
		System.out.println("Super num4 = " + getNum4()); //메서드로 받아오면 private도 호출 가능(method도 private이 아님)
		System.out.println("Sub num5 = " + num5);
	}
}
