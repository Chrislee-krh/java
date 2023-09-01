package day11.quiz.Animal;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Goldfish goldfish = new Goldfish();
		Tiger tig = new Tiger();
		Shark shark = new Shark();
		
		dog.run();
		dog.sleep();
		dog.eat();
		goldfish.swim();
		tig.eat();
		shark.swim();
		
//		Dog a = new Dog();
//		a.sleep("개");
//		System.out.println(a.consume("개") + "을(를) 먹습니다.");
		
	}
}
