package day21.thread;

public class ThreadStatusJ {

	public static void main(String[] args) {
		// join() 메서드: 다른 스레드의 실행이 완료될 때까지 기다리는 메서드
		
		Sum t1 = new Sum();
		Sum t2 = new Sum();
		
		t1.start();
		t2.start();
		try {
			t1.join(); // t1스레드가 종료될 때 까지 대기
			t2.join(); // t2스레드가 종료될 때 까지 대기
		} catch (InterruptedException e) {}
			System.out.println("두 스레드의 sum 합계 = " + (t1.sum + t2.sum)); // join이 없으면 0 // 있으면 9900
	}
}

class Sum extends Thread{
	int sum = 0;

	@Override
	public void run() {
		for(int i =0; i<= 100; i++) {
			sum += i;
		}
	}
	
}