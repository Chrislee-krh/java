package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonyVarExample {

	private Frame f;
	
	public AnonyVarExample() {
		f = new Frame("AnonymousVar Class");
	}
	
	WindowAdapter handler = new WindowAdapter() {  // ()뒤에 정의를 하라는 {}이게 뜨면 우리가 아는 정상 클래스가 아니다.
		public void windowClosing(WindowEvent e) {
			System.out.println("종료 버튼을 눌렀어요!");
			System.exit(0);;
		}
	};
	
	public void launchFrame() {
		f.addWindowListener(handler);
		f.setSize(300, 200);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		AnonyVarExample ave = new AnonyVarExample();
		ave.launchFrame();

	}

}
