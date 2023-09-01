package day11.quiz.Animal;

public class Goldfish extends Aqua implements Animal {

	@Override
	public void sleep() {
		System.out.println("금붕어는 잠을 잡니다.");
	}

	@Override
	public void eat() {
		System.out.println("금붕어는 플랑크톤을 먹습니다.");
	}
	

}
