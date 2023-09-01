package day10.interface_;

public class InterfaceMemberExample implements ISomething {

	@Override
	public void run() { // 반드시 재정의 해야함.
//		My_Int= 33; // ISomething 인터페이스에 final 변수라서 안됨.
		System.out.println("run(): " + ISomething.A);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(ISomething.My_Int);
		System.out.println(InterfaceMemberExample.My_Int);
		ISomething is = new InterfaceMemberExample();
		is.run();
		InterfaceMemberExample im = new InterfaceMemberExample();
		im.run();
	}

}
