package day07.quiz;

public class InstanceQuiz {

	/*
	 * 다음에 설명하는 객체에 클래스를 생성하여 확인하세요.
	 * 
	 * 모니터 클래스를 생성!
	 * - 모니터는 해상도, 크기, 밝기, 상태(on/off) 속성을 가짐
	 * - 모니터는 기본적으로 해상도, 크기, 밝기, 값을 100. 상태는 off를 가리킴
	 * - 모니터에는 버튼을 누르는 메서드. 즉, 전원 on/off 기능이 존재함.
	 * 해당 메서드 실행시 전원이 켜져 있다면 꺼지고, 꺼져 있다면 켜져야 함.
	 * 
	 */
		
	/*
	 * 티비 클래스를 생성!
	 * - TV 클래스의 멤버변수(각 TV의 상태를 나타내는 변수)
	 * - 채널, 이전 채널(prevChannel)메서드, 볼륨, 전원(isPowerOn)
	
	 * 각 인스턴스(각 개체)마다 다를 수 있는 값을 클래스의 변수(필드)로 사용한다.
	 * final
	 * 최대볼륨/최소볼륨
	 * 최대채널/최소채널
	 */
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 300;
	final int MIN_CHANNEL = 1;

	// 기본생성자 : 채널 7, 볼륨 20을 생성
	
	//TV기능 
	// -isPowerOn 값이 true면 false, false면 true 변경
	
	// # 다음의 모든 기능은 isPowerOn이 true일 때만 올바르게 동작함.
	//	- volume의 값을 1증가시킴, 최대볼륨 100	(volumeUp) 
	//	- volume의 값을 1감소시킴, 최소볼륨 0		(volumeDown)
	//	- channel의 값을 1증가시킴, 최대채널 300	(channelUp)	
	//	- channel의 값을 1감소시킴, 최소채널 1 	(channelDown)
	//	- 채널 번호를 매개변수로 전달받으면 채널을 이동함 (moveChannel)
	//	- 이전 채널로 돌아감 (prevChannel)
	
	void getTvInfo() {
		System.out.println("전원 : ");
		System.out.println("채널 : ");
		System.out.println("볼륨 : ");
		System.out.println("저장된 이전채널 : ");
	}
	
	
}
