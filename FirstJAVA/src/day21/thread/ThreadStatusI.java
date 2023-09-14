package day21.thread;

public class ThreadStatusI {
	
	public static void main(String[] args) {
		// interrupt() 메서드:
		//		스레드가 일시정지있을 때, InterruptedException 예외 발생으로 정상 종료
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					int i = 1;
					while(true) {
						System.out.println("t1: " +i);
						Thread.sleep(1000);
						i++;
					}
				} catch (InterruptedException e) {
				System.out.println("내부에서 스레드 실행 종료");
				}
			}
			});
			t1.start();
			try {
				Thread.sleep(10000); 	// 10초
			} catch (InterruptedException e) {
				System.out.println("메인에서 일시정지: " + e.getMessage());
			}
			t1.interrupt(); // 일시정지 상태일 때 interruptedException을 발 생시켜 정상 종료	
	}
}

