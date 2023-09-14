package day21.thread;

import java.io.IOException;

public class ProcessEx {

	public static void main(String[] args) {
		// 자바에서 다른 프로그램의 프로세스를 실행할 수 있는 방법
		// p1, p2는 각각 다른 스레드로 열려있음.
		try {
			// 메모장 실행
			Process p1 = Runtime.getRuntime().exec("mspaint.exe"); // new 안썼음. 객체를 만들지 않고 받아와 쓰겠다는 뜻.
			System.out.println(p1.pid());
			Process p2 = Runtime.getRuntime().exec("notepad.exe");
			
			p1.waitFor(); // p1 프로세스가 종료될 때까지 대기. mspaint를 끄면 그제서야 notepad가 꺼짐.
			p2.destroy(); // p2 프로세스를 종료
	
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
