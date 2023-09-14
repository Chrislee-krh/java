package day21.thread;

public class ThreadStatusI2 {

	public static void main(String[] args) {
		// interrupt() 메서드:
		//		스레드가 일시정지있을 때, InterruptedException 예외 발생으로 정상 종료
		// 		sleep()을 사용하지 않은 상태에서 중지
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
					int i = 1;
					while(true) {
						System.out.println("t1: " +i);
						i++;
						if(Thread.interrupted()) {	// 2) interrupted() 조건 충족
							break;
						}
					}
					System.out.println("스레드 실행 종료");
			}
			});
			t1.start();
			try {
				Thread.sleep(10000); 	// 10초
			} catch (InterruptedException e) {}
			t1.interrupt();	// 1) t1에 interrupted() 실행
	}

}
