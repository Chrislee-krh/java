package day15.generic;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericExample2 {

	public static void main(String[] args) {
		Wallet<Card, Money> card_wallet = new Wallet<>("파란색");
		Wallet<CreditCard, Money> card_wallet2 = new Wallet<>("하늘색");
		//		Wallet<String,Integer> card_wallet2 = new Wallet<>("하늘색"); 클래스 제한을 상속으로 걸어둬서
		card_wallet.pouch.add(new CreditCard());
		card_wallet.pouch.add(new DebitCard());
		card_wallet.pouch.add(new BaeumCard());
		
		card_wallet2.pouch2.add(new Dollar());
		card_wallet2.pouch2.add(new Won());
//		card_wallet2.pouch2.add(new DebitCard()); // 최초 객체 만들 때 참조하는 타입을 자식으로 해두면, 해당 타입제외 다른 자식들로 객체 생성해서 삽입 불가.
		
		ArrayList<Integer> int_list = new ArrayList<>();
		ArrayList<String> str_list = new ArrayList<>();
		ArrayList<Object> apple_list = new ArrayList<>();
		
		str_list.add("제네릭 때문에 문자열만 들어감");
		str_list.add("이유는 문자열 제네릭 클래스기 때문!");
		int_list.add(100);
		int_list.add(new Integer(20));
		apple_list.add(new Person<String>("홍길동", 11));
		
		usingArrayListMethod(apple_list);
		usingArrayListMethod(str_list);
		usingArrayListMethod(int_list);
		
	}
	// 제네릭이 다른 것 만으로는 오버로드가 안된다.(원래는 파리미터의 타입이 다르면 생성 가능해야하지만..)
//	static void usingArrayListMethod1(ArrayList<Integer> list) {
//		System.out.println(list);
//	}
//	static void usingArrayListMethod1(LinkedList<String> list) {
//		System.out.println(list);
//	}
	// <?>: 와일드 카드. 제네릭 타입으로 오버로드를 구현하고 싶을 때 사용.
	static void usingArrayListMethod(ArrayList<?> list) {
		System.out.println(list);
	}
	
	static void usingArrayListMethod(Wallet<? extends Card, ? extends Money> w) {
		
	}
}

// 제네릭에 extends는 타입의 범위를 제한하는 역할을 한다.
// 지갑 클래스 생성
// - One extends Card: 첫 번째 타입은 Card를 상속받는 클래스만 허용
// - Two extends Money: 두 번째 타입은 Money를 상속받은 클래스만 허용

class Wallet<One extends Card, Two extends Money> {
	
	ArrayList<One> pouch;
	ArrayList<Two> pouch2;
	String color;
	
	public Wallet(String color) {
		pouch = new ArrayList<>();
		pouch2 = new ArrayList<>();
		this.color = color;
	}

	public One get(int index) {
		return pouch.get(index);
	}

	@Override
	public String toString() {
		return "지갑의 내용물을 출력합니다.";
	}
	
}

class Card{}

class CreditCard extends Card {}
class DebitCard extends Card {}
class BaeumCard extends Card {}

class Money{}
class Won extends Money {}
class Dollar extends Money {}