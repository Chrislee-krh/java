package day09.quiz;

public class ShopQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b1 = new Buyer();
		b1.cash = 500000;
		
		b1.addToCart(new Toy(20000, "티니핑"));
		b1.addToCart(new Toy(20000, "하쵸핑"));
		b1.addToCart(new Toy(20000, "키키핑"));
		b1.addToCart(new Snack(5000, "다이제스트"));
		b1.addToCart(new Snack(5000, "자갈치"));
		b1.addToCart(new Snack(5000, "먹태깡"));
		b1.addToCart(new Beverage(10000, "하이네켄"));
		b1.addToCart(new Beverage(10000, "벡스"));
		
		System.out.println("========== 카트 정보 ==========");
		b1.viewCart();
		
		b1.buyAll();
		System.out.println("========== 카트 정보 ==========");
		b1.viewCart();
		System.out.println("========== 트렁크 정보 ==========");
		b1.viewTrunk();
		b1.addToCart(new Toy(20000, "믿음핑"));
		b1.buyAll();
		
		b1.receipt();
		
		for (int i = 0; i <b1.t_index; i++) {
			Product p = b1.trunk[i];
			
			if(p instanceof Beverage) {
				Beverage d = (Beverage) p;
				d.drink();
			}else if(p instanceof Snack) {
				Snack s = (Snack) p;
				s.consume();
			} else {
			}
		
		}
	}
}

class Buyer{
	//조건- 인스턴스 변수(상태): 필요한 만큼 써라. 
	int cash;
	int size;
	int sum;
	
	//트렁크 관련 변수
	final int MAX_TRUNK_SIZE = 20;
	Product[] trunk  = new Product[MAX_TRUNK_SIZE];
	int t_index = 0;	
	
	//카트 관련 변수
	final int INIT_CART_SIZE = 3;
	Product[] cart = new Product[INIT_CART_SIZE];
	int c_index = 0;
			
	/*
	 * Buyer의 기능(method())
	 * 메서드1: 
	 * 1. 이름: buy
	 * 2. 기능: 지정한 물건(Product)을 구입한다.
	 * 			바이어의 돈(cash)에서 물건의 가격을 빼고, 내 트렁크(trunk)에 담는다.
	 * 			만약에 가진 돈이 부족하면 구매할 수 없습니다 출력.
	 * 			리턴타입 void, 매개변수: Product p
	 */
	
	void buy(Product p) {
		if(cash < p.getPrice()) {
			System.out.println("가진 돈이 너무 적습니다."); 
			return;
		}else if(t_index == MAX_TRUNK_SIZE) {
			System.out.println("트렁크가 가득 찼습니다."); 
			return;
		}
		
		cash -= p.getPrice();
		trunk[t_index++] = p;
	
	}
		//내답
//		if(cash>=p.getPrice()) {
//			cash -= p.getPrice();
//	}else if 트렁크 사이즈 확인해야함
//			trunk[t_index] = p;
//		} else  System.out.println("소유 중인 돈이 부족합니다.");
	
		//buy와 buyAll의 개념을 같이 봐서 한 실수
//		for (int i = c_index; i>=0; i-- ) {
//			trunk[t_index] = p;
//			if(cash<p.getPrice()) {
//				System.out.println("금액이 부족하여 구매할 수 없습니다.");
//				break;
//			} else {
//				cash -= p.getPrice();
//				t_index++;
//					if(t_index>MAX_TRUNK_SIZE) System.out.println("트렁크 사이즈를 초과했습니다.");
//			}
//		}	  
	 
	/* 
	 * 메서드2:
	 * 1. 이름: buyAll
	 * 2. 기능: 장바구니(cart)에 지정된 모든 물건을 구매(buy)한다. 비우는 것.
	 * 			리턴타입 void, 매개변수: 없음, Product[] cart
	 */
	
	void buyAll() {
		if(c_index - getNullCount() + t_index > MAX_TRUNK_SIZE) { //c_index+t_index
			System.out.println("구매하려는 물건이 너무 많습니다.");
			return;
		}
		for (int i = 0; i< c_index; i++) {
			if(cart[i] != null)
				buy(cart[i]);
		}
		
		clearCart();
	}
	
		private void clearCart() { // 카트 비우기
			cart = new Product[INIT_CART_SIZE];
			c_index = 0;
		}
		
		int getNullCount() {
			int count = 0;
			for (int i = 0; i < c_index; i++) {
				if(cart[i] == null)
					count++;
			}
			return count;
		}
		

		
//		내답
//		for (int i = c_index; i>=0; i-- ) {
//			trunk[t_index] = cart[i];
//			sum += cart[i].getPrice();
//			t_index++;
//			if(t_index>MAX_TRUNK_SIZE) System.out.println("트렁크 사이즈를 초과했습니다.");
//			if(cash>=sum) cash -= sum;
//			else {
//				System.out.println("금액이 부족하여 구매할 수 없습니다.");
//				break;
//			}
//		}
//	}
	
	/* 메서드3:
	 * 1. 이름: addToCart
	 * 2. 기능: 지정한 물건을 장바구니(cart)에 담는다.
	 * 			만약에 장바구니에 담을 공간이 부족하면 장바구니 배열의 크기를 2배로 늘린 후 담는다.
	 * 			리턴타입 void, 매개변수: Product p
	 */
	
	void addToCart(Product p) {
		// 카트 공간이 비어있는 경우
		for(int i = 0; i<c_index; i++) {
			if(cart[i] == null) {
				cart[i] = p;
			System.out.println("비어있는 곳 "+i+"에 넣었습니다.");
			return;
			}
		}
		//왜 ??
//		private void viewList(Product[] pArr, int index) {
//			for(int i = 0; i < index; i++) {
//				Product p = pArr[i];
//				System.out.printf(i+1+". 상품명[%s], 가격[%d]\n", p.getName(), p.getPrice());
		
		
		// 카트 공간 없는 경우 2배씩 증가
		if(c_index == cart.length) {
			Product[] newCart = new Product[cart.length * 2];
			System.arraycopy(cart, 0, newCart, 0, cart.length);
			cart = newCart;
		}
			cart[c_index++] = p; // 원래는 이거 하나면 되는데, 카트 공간 두배, 빈 공간?떄문이다
	}
	
//		for (int i = 0; i<INIT_CART_SIZE; i++) {
//			cart[c_index] = p;
//			c_index++;
//			if(c_index%INIT_CART_SIZE == 0) {
////				Buyer(INIT_CART_SIZE) {
////					this.INIT_CART_SIZE = INIT_CART_SIZE *2;
////				}
//				System.out.println("카트가 가득합니다. 두 배의 카트를 사용합니다.");
//				size = INIT_CART_SIZE * 2;
//				if (c_index>3) size= size *2;
//				if(c_index<20) { 
//					System.out.println("트렁크의 최대 크기랑 같아져서, 더이상 구매가 불가합니다.");
//					break;
//				}
//			}  
//		}
//	}
	/* 메서드4:
	 * 1. 이름: cancel
	 * 2. 기능: 지정한 물건을 장바구니에서 뺀다. 뺀 곳에는 다시 물건을 담을 수 있어야 한다.
	 * 			리턴타입 void, 매개변수: int cart_index
	 */
	
	void cancel(int cart_index) { // cart_index는 0번부터 시작하는 배열이 아닌, 우리가 생각하는 카트의 번호이다.
		cart[cart_index -1] = null;
	}
	//내답
//		for(int i = c_index; i<c_index; i++ ) {
//			cart[c_index] = cart[c_index+1];
//		}
//	}
		
		
	/* 메서드5:
	 * 1. 이름: receipt
	 * 2. 기능: buyer가 구매한 물건의 목록과 사용금액, 남은 금액을 출력한다.
	 * 			리턴타입void, 매개변수: 없음
	 */
	
	void receipt() {
		// 구매 물건 목록 보여주기
		viewTrunk();
		// 사용금액과 남은 금액 출력
		System.out.println("사용 금액: " + getTotalPrice(trunk, t_index));
		System.out.println("남은 금액: " + cash);
	}
		
		
		//내답
//	sum += cart[i].getPrice(); 이 내용은 buy(all)에서 금액을 넣는게 아니라 여기서 쓴다. 카트에 들어간 것들을 사는건 여기가 아니라서 이건 안된다.
//		for(int i = c_index; i>=0; i--) {
//			System.out.println("구매한 물품 목록: " + cart[c_index]);
//			System.out.println("잔액: " + cash);
//		}
//	}
		
	private void viewList(Product[] pArr, int index) {
		for(int i = 0; i < index; i++) {
			Product p = pArr[i];
			System.out.printf(i+1+". 상품명[%s], 가격[%d]\n", p.getName(), p.getPrice());
		}
	}
	
	//트렁크 보기
	public void viewTrunk() {
		viewList(trunk, t_index);
	}
	
	//카트 보기
	public void viewCart() {
		viewList(cart, c_index);
	}
	
	int getTotalPrice(Product[] pArr, int index) {
		int price = 0;
		for(int i = 0; i<index; i++) {
			price += pArr[i].getPrice();
		}
		
		return price;
	}
}
/*
 * 	Product 클래스를 상속받아서 상품을 3개 이상 만들어 보세요.
 * 	(단, Product 클래스를 변경하면 안됨!)
 */


class Product { // 부모 클래스로 사용 예정

	String name;
	private int price;//private: 내 클래스 내부에서만 사용하려고 함
	public Product(int price){
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}

class Toy extends Product {
	// 상속받은 클래스는 생성자에서 반드시 부모 생성자를 호출
	// (호출하지 않으면 기본 타입으로 생략되어 있다)
	
	// 아무것도 적지않은 생성자에는 super()가 생략되어 있다.
	
	// Product라는 부모 클래스에는 기본 생성자가 없기 때문에 반드시 super(int price) 타입의 생성자를 반드시 호출해야합니다.
	
	public Toy(int price, String name) {
		super(price);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	void play() {
		System.out.println("'" + name + "'(을)를 가지고 딸과 놀고 있습니다.");
	}
}

class Snack extends Product {
	
	public Snack(int price, String name) {
		super(price);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	void consume() {
		System.out.println("'" + name + "'(을)를 와구와구 먹고 있습니다.");
	}
}

class Beverage extends Product {
	
	public Beverage(int price, String name) {
		super(price);
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	void drink() {
		System.out.println("'" + name + "'(을)를 공대표와 원샷합니다.");
	}
}




