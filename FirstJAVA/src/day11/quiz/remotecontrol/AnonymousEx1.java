package day11.quiz.remotecontrol;

public class AnonymousEx1 {

	public static void main(String[] args) {

		Machine tv = new TV("TV");
//		Machine comp = new Comp("컴퓨터");
		
		Machine.machineWork(new Rc() {
			
			public void on() {
				System.out.println(tv.getName()+"를 켭니다.");
			}
			
			public void off() {
				System.out.println(tv.getName()+"를 끕니다.");
			}
		}, tv);
		
//		Machine.machineWork(Rc, comp);
		
	}
}
