package day08.quiz;

public class AirplaneModeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperSonicAp s1 = new SuperSonicAp("비행기");
		
		s1.takeOff();
		s1.fly();
		s1.flymode =1;
		s1.fly();
		s1.flymode =0;
		s1.fly();
		s1.land();
		
		
	}

}
