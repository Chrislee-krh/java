package day11.quiz.zoo;

public class ZooExam {

	public static void main(String[] args) {
		Zookeeper zk = new Zookeeper();
		Lion lion = new Lion();
		Deer deer = new Deer();
		zk.feed(deer);
		zk.feed(lion);
	
	}

}
