package day06;

public class Account {
	// 실 객체를 클래스로 만드는 과정을 객체 추상화라고 함
	
	// 객체: 1) 기능을 위한 객체, 2)데이터 저장을 위한 객체
	
	// Account(은행 계좌)
	// - 명사적 특성(속성): 계좌명, 계좌 번호, 비밀번호, 잔액, 이자
	// - 동사적 특성(기능): 입금하다, 출금하다 - 이체, 잔액조회 
	
	// 변수 선언(멤버변수 - 속성)
	public String name;
	public String accountNumber;
	public String passwd;
	public long balance;
	public float interest;
	
	// 메서드 선언(기능)
	// 입금하다
	public void saveMoney(long amount) {
		balance = balance + amount; //balance += amount;
	}
	// 출금하다
	public void withdrawMoney(long amount) {
		balance = balance - amount; //balance -= amount;
		
	}
	// 잔액확인
	public long getBalance() { //넘길 것 없이 있는 내용만 가지고 확인할 땐 parameter 필요없음!
		return balance;
	}
	
}
