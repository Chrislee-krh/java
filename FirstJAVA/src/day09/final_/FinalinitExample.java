package day09.final_;

public class FinalinitExample {

	public static void main(String[] args) {
		// final 멤버 변수는 선언시(a), 초기화자(b), 또는 기본 생성자(c) 중에 하나에서 반드시 초기화 해야한다.
		// 기본 생성자가 아닌 생성자에서는 파라미터를 통한 초기화 안됨.
		
		Finalinit f = new Finalinit();
		System.out.println(f.a);

	}

}


class Finalinit {
	final int a;
//	final int a = 10;  	//a
//	{
//		a = 10;			//b
//	}
	Finalinit(){		//c
		a = 10;
	}
	Finalinit(int a){
		this.a = a; // 이것은 final 필드의 초기화가 아님.
	}
////	
}