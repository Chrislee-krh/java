package day07.quiz;

public class MonitorExample {

	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		System.out.println("모니터 기본 값: 해상도-"+monitor.resol+" 사이즈-" +monitor.size+" 밝기"+monitor.bright+" 전원"+monitor.state);
		
		// 전원 버튼 클릭
		monitor.pressPowerButton();
		System.out.println(monitor.state);
		
		// 전원 버튼 클릭
		monitor.pressPowerButton();
		System.out.println(monitor.state);
	}

}
