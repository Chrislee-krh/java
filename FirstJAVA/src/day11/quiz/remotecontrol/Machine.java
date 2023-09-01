package day11.quiz.remotecontrol;

public class Machine {
	
	protected String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void machineWork(Rc remocon, Machine machine) {
		remocon.on();
		remocon.off();
	}
}
	
	//내답
//	String name;
//	boolean state = false;
//		
//	public String machineWork(String name){
//		state = !state;
//		if(state != true && state != false) {
//			System.out.println("파워 버튼을 눌러주세요");
//		}
//		return name;
//	}
//	
//	public static void main(String[] args) {
//		
//		TV tv = new TV();
//		tv.machineWork("TV");
//		tv.machineWork("TV");
//		
//		AC ac = new AC();
//		ac.machineWork("에어컨");
//		ac.machineWork("에어컨");
//		
//	}
//}

