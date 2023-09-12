package day19;

public class LambdaEx3 {

	public static void main(String[] args) {
		
		LambdaInterface3 li3 = (String name) -> {
			System.out.println("제 이름은 "+name+"입니다");
		};
		
		LambdaInterface3 li32 = name -> { // 이미 인터페이스에 타입이 정의되어있어서 String 굳이 안써도 됨. argument(인자값)만 넘어왔다고 생각하면 됨.
			System.out.println("제 이름은 "+name+"입니다");
		};
		
		li3.print("홍길동");
		li32.print("이순신");
	}
	
	
}

@FunctionalInterface
interface LambdaInterface3 {
	void print(String name);
//	void print();
}