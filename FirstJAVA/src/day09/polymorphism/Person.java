package day09.polymorphism;

public class Person {

	// 이름과 나이
	public String name;
	public int age;
	protected float height;
	float weight;
	
	public String getDetail() {
		return "이름: " +name+ "\t나이: " +age;
	}
		
	// 부모인 Person에 생성자 만들기
	// 반환 값, 이름, 매개변수의 타입과 개수
	public Person(int age, String name) { // Person(int, String)
		this.name = name;
		this.age = age;
	}
	
	// 매개 변수의 타입이 다른 순서로 되어 있어도 구분됨.
	public Person(String name, int age) { // Person(String, int)
		this.name = name;
		this.age = age;
	}

	public Person() {
		this("이름 없음", 1);
	}
	
	public Person(String name) {
		this(name, 1);
	}
		
	public Person(String name, int age, float height) {
		this(name,age);
		this.height = height;
	}
	

	public void walk() {
		System.out.println(name + "(은)는 걸어라.");
	}
	
	
	// 생성자의 첫 라인은 반드시 super()또는 this()가 와야함.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null)? 0:name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) { // 동일 객체
			return true;
		}
		if(obj == null) return false; // null값 확인
		if(getClass() != obj.getClass()) return false; // 객체 생성 클래스 비교
		Person other = (Person)obj;
		if(age != other.age) return false; // 객체 내 age멤버 비교 확인
		if(name == null) {
			if(other.name != null) {
				return false; // 객체 내에 이름 확인
			}
		} else if(!name.equals(other.name)) return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "Person [name="+name+", age="+age+"]";
	}
	
}
