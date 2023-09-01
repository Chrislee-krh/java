package day11.quiz.Animal;

public class Dog extends Terre implements Animal {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("개는 잠을 잡니다.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("개는 사료를 먹습니다.");
	}
	
	
	
//	@Override
//	public String consume(String name) {
//		this.name = name;
//		System.out.print(name+"(은)는 ");
//		return "사료";
//	}

}
