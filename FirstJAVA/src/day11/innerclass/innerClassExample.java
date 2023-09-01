package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 대표적인 내부 클래스 사용 예제 - JAVA GUI(graphic user interface)

// JAVA GUI란?
// - 프로그램을 그래픽화(프레임창을 띄워서 구현)시켜 작동하는 것을 말함. 
// - 패키지: AWT(만들기 쉽고, 무거움), SWING(만들기 어려우나, 가벼움)
// - Frame 또는 Jframe 클래스를 이용해서 프레임창을 구현. 그리고 
//		각종 이벤트 및 버튼, 패널, 입력창, 메뉴바, 속성 같은 구성 요소들을 각 클래스들을 이용해서 구현
// - Frame(A)클래스가 각종 구성요소(B)클래스들을 전부 호출.
//		구성요소(B) 클래스 들은 각 프레임 창별로 달라지는 형태로 개별 클래스화 하면 여러 측명 낭비 일어날 수 있음.
//		따라서! 내부 클래스 사용

public class innerClassExample {
	
	private Frame f;
	
	public innerClassExample() { 
		f = new Frame("Inner 예제");
	}
	
	public void launchFrame() {
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(300, 200);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		innerClassExample ie = new innerClassExample();
		ie.launchFrame();
		
	}

	// 멤버 이너 클래스...
	// 컴파일 시 같이 컴파일되고, 온전한 클래스라 상속, 다형성 기능 사용 가능.
	// 윈도우 어댑터는 띄워놓은 프레임에 최소, 최대, x등의 버튼을 누르는 이벤트 처리시 사용!(우측 상단 세 개 기능)
	// 때문에 프레임을 만들 때 마다 필요하지만, 각 프레임에 종속되어야 하기 때문에 하나의 클래스로 만들기엔 여러 제약이 있다.
	
	private class MyWindowAdapter extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) { // 박스(창)에 닫는 버튼(x)를 누르면 뭐가 뜰지를 적어주고, 무엇을 구현할지 띄운다.
			System.out.println("x를 눌렀어요");
			System.exit(0); // 스위치할 때 나간 것 처럼.. 얘는 시스템을 죽인다.
			super.windowClosing(e);
		}
	}
}