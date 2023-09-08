package day13.api.java_lang;

public class AutoBoxingPolymorphismExample {

	public static void main(String[] args) {

		Object[] arrObj = new Object[10];
		
		arrObj[0] = new Byte((byte)127);
		arrObj[1] = new Short((short)32767);
		arrObj[2] = new Integer(2147483647);
		arrObj[3] = new Long(21474836478l);
//		arrObj[4] = new Float(3.5f);
		arrObj[4] = 3.5f; // 박싱 - autoboxing - 1.8부터 추가된 기능
		arrObj[5] = new Double(3.7);
		System.out.println(((Double)arrObj[5]).doubleValue()); // 언박싱 
		arrObj[6] = new Boolean(true);
		arrObj[7] = new Character('j');
		arrObj[8] = new String("Hello World!");
		arrObj[9] = new java.util.Date();
		
		for(int i = 0; i < arrObj.length; i++) {
			System.out.println(arrObj[i]);
		}
		
		int a = Integer.parseInt("100"); // 문자열 값을 기본 데이터 형으로 변경
		System.out.println(a);
		
	}

}
