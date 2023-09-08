package day15.compare.quiz;

public class CelebList implements Comparable<CelebList>{

	String name;
	int num;
	public CelebList(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		
		return "CelebList [이름: " + name + ", 멤버번호: " + num + "]";
//		return String.format("%s [%d]", name, num);
	}
	@Override
	public int compareTo(CelebList o) {
		// CompareTo() 메서드 사용법(매개변수로 비교 대상은 전달)
		// - 현재 인스턴스와 o의 자리 바꾸고 싶으면 1, 그대로-1, 둘의 값이 같다면 0
//		return this.num - o.num;
		int next = o.num;
		System.out.println(num + " vs " +next);
		if(num < next) {
			return -1;
		} else if(num > next) {
			return 1;
		} else {
			return 0;
		}
	}
	


	
	
	
}
