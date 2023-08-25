package day07.quiz;

import java.util.Scanner;

public class TVchris {

	int channel;
	int currentChannel;
	
	int volume;
	int channelChg;
	int prevChannel;
	boolean state = false;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 300;
	final int MIN_CHANNEL = 1;
	
	TVchris(){
		this.channel = 7;
		this.volume = 20;
		this.state = false;
	}
	public void isPowerOn() {
		state = !state; // isPowerOn = !isPowerOn이라고 하면 아래 if(!isPowerOn)으로 쓸 수 있다.
		if(state==true) System.out.println("전원이 켜졌습니다.");
		else System.out.println("전원이 꺼졌습니다.");
	}
	
	void volumeUp() {
//		if(!state) {
//			System.out.println("전원이 꺼져있습니다.");
//			return;
//		} else if(volume == MAX_VOLUME) {
//			System.out.println("현재 볼륨이 최대입니다.");
//			return;
//		}
//		volume++;
//		System.out.println("현재 볼륨은 "+ volume + "입니다.");
		
		if(state==true&&(volume>=MIN_VOLUME&&volume<MAX_VOLUME)) {
			volume = volume + 1;
			System.out.println("현재 볼륨은 " + volume);
		} else {
			volume = volume -1;
			System.out.println("최대 볼륨을 넘었거나, 최소 볼륨보다 작습니다.");
		}
	}
	void volumeDown() {
		if(state==true&&(volume>=MIN_VOLUME&&volume<MAX_VOLUME)) {
			volume = volume - 1;
			System.out.println("현재 볼륨은 " + volume);
		} else {
			volume = volume + 1;
			System.out.println("최대 볼륨을 넘었거나, 최소 볼륨보다 작습니다.");
		}
	}
	
	void channelUp() {
		if(state==true&&(channel>=MIN_CHANNEL&&channel<MAX_CHANNEL)) {
			channel = channel +1;
			System.out.println("현재 채널은 " + channel);
		} else {
			channel = MIN_CHANNEL;
			System.out.println("최대 채널을 넘었거나, 최소 채널보다 작습니다.");
		}
	}
	
	void channelDown() {
		
		if(state==true&&(channel>=MIN_CHANNEL&&channel<MAX_CHANNEL)) {
			channel = channel -1;
			System.out.println("현재 채널은 " +channel);
		}
		else {
			channel = MAX_CHANNEL;
			System.out.println("최대 채널을 넘었거나, 최소 채널보다 작습니다.");
		}
	}
	
	void moveChannel() {
		if(state==true) {
		Scanner scan = new Scanner(System.in);
		System.out.print("채널을 입력하세요> ");
		int channelChg = scan.nextInt();
		prevChannel = channel;
		channel = channelChg;
		if(channel<MIN_CHANNEL&&channel>MAX_CHANNEL) {
			System.out.println(MIN_CHANNEL + "~" + MAX_CHANNEL + "사이의 " +"올바른 채널을 입력하세요");
		}
		System.out.println("현재 채널은 " + channelChg);
		} else System.out.println("전원이 꺼져있습니다.");
	}
	// 쌤답
//		if(!isPowerOn) {
//			System.out.println("전원이 꺼져있습니다.");
//			return false;
//		}
//		if(ch>=MIN_CHANNEL && ch <= MAX_CHANNEL) {
//			prevChannel = channel;
//			channel= ch;
//			System.out.println(channel + "CH");
//			return true;
//		} else {
//			System.out.println("채널을 잘못입력하셨습니다.");
//			return false;
//		}

			
	void prevChannel() {
		// 현 채널 = 전 채널, 전 채널 = 현 채널이 가능하게..
		// 쌤답
//		if(!isPowerOn) {
//			System.out.println("전원이 꺼져있습니다.");
//			return;
//		} else if(prevChannel == 0) {
//			System.out.println("이전 채널 없음");
//		}
//		
//		int temp = channel;
//		channel = prevChannel;
//		prevChannel = temp;
//		
//		getTvInfo();
		
		// 내답
		if(state==true) {
			channelChg = channel;
			channel = prevChannel;
			prevChannel = channelChg;
			
			System.out.println("이전 채널은 " + channel);	
		}
		
	}

	void getTvInfo() {
		System.out.println("전원 : ");
		System.out.println("채널 : ");
		System.out.println("볼륨 : ");
		System.out.println("저장된 이전채널 : ");
	}
	
	
	public static void main(String[] args) {
		TVchris tv1 = new TVchris();
		
		tv1.getTvInfo();
		tv1.isPowerOn();
		tv1.moveChannel();
		tv1.prevChannel();
		tv1.prevChannel();
		tv1.prevChannel();
		tv1.prevChannel();
		
//		tv1.isPowerOn();
//		tv1.isPowerOn();
//		tv1.channelDown();
//		tv1.channelUp();
//		tv1.volumeDown();
//		tv1.volumeUp();
//		tv1.moveChannel();
//		tv1.prevChannel();
//		tv1.isPowerOn();

	}

}
