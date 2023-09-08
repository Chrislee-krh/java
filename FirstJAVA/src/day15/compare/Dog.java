package day15.compare;

public class Dog implements Comparable<Dog>{

	String dogId;
	String dogName;
	int weight;
	
	// Comparable 인터페이스의 추상 메서드
	@Override
	public int compareTo(Dog o) {
		return this.weight - o.weight;
	}

	public Dog(String dogId, String dogName, int weight) {
		super();
		this.dogId = dogId;
		this.dogName = dogName;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Dog [dogId = " + dogId + ", dogName= " + dogName +"]"+ this.hashCode();
		
	}

	public String getDogId() {
		return dogId;
	}

	public void setDogId(String dogId) {
		this.dogId = dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// 객체간 비교를 하기 위해서는 반드시 hashCode(), equals()를 둘 다 재정의해야함
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true; // 생성된 객체 그 자체를 비교하는 상황. 주소,값 모두 동일하면 true
		if(obj == null) return false; // obj의 객체가 생성되지 않은 상황
		if(getClass() != obj.getClass()) return false; // 생성 클래스 비교
		// 내무 멤버에 재한 비교
		Dog other = (Dog)obj;
		// dogId
		if(dogId == null) {
			if(other.dogId != null) {
				return false;
			}
		} else if(!dogId.equals(other.dogId)) return false;
		// dogName
		if(dogName == null) {
			if(other.dogName != null) {
				return false;
			}
		} else if(!dogName.equals(other.dogName)) return false;
		// weight
		if(weight != other.weight) return false;
		return true; // 위의 false인 경우들에 해당하지 않으면, 둘은 같은 위치가 아니라도 같은 객체라고 보겠다.
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dogId == null) ? 0 : dogId.hashCode());
		result = prime * result + ((dogName == null) ? 0 : dogName.hashCode());
		result = prime * result + weight;
		return result;
	}
	
}
