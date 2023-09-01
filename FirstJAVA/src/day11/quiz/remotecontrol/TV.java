package day11.quiz.remotecontrol;

public class TV extends Machine {

	public TV(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	
	public void show() {
		System.out.println("쇼를 보여준다.");
	}
}
	//내답
//	@Override
//	public String machineWork(String name) {
//		System.out.println("TV 리모콘의 파워 버튼");
//		super.machineWork(name);
//		if(state == true) {System.out.println(name + "(이)가 켜졌습니다.");}
//		else if(state == false) {System.out.println(name + "(이)가 꺼졌습니다.");}
//	
//		return name;
//	}
//}
