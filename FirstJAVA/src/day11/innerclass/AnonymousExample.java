package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonymousExample {
	
	private Frame f;
	
	public AnonymousExample() {
		f = new Frame("Anonymous Class");
	}
	
	public void launchFrame() {

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료 버튼을 눌렀어요!");
				System.exit(0);;
			}
		});
			f.setSize(300, 200);
			f.setVisible(true);
	};
	
	public static void main(String[] args) {
		AnonymousExample ae = new AnonymousExample();
		ae.launchFrame();
	}

}
