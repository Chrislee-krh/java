package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerLocalExample {

	private Frame f;
	
	public InnerLocalExample() {
		f = new Frame("Inner Local Class");
	}

	public void launchFrame() {
		// Inner Local Class
		final String btn = "X버튼";
		class MyWindowAdapter extends WindowAdapter {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("X버튼을 클릭했습니다.");
				System.exit(0);
				super.windowClosing(e);
			}
		}
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(300, 200);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		InnerLocalExample ie = new InnerLocalExample();
		ie.launchFrame();
	}
}
