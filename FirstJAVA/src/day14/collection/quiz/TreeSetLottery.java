package day14.collection.quiz;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetLottery {
	
	// TreeSet을 이용하여 로또번호 6개를 생성하는 프로그램을 작성하세요
	// TreeSet 생성
	// 무한루프 사용 1~45까지의 난수 발생
	// 난수 추가
	// 난수의 크기가 6이 되면 무한 루프를 빠져나옴
	
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<>();
		Random rand = new Random();
	
		int num = 0;
		
		while(true) {
			num = rand.nextInt(1,46);	
			lotto.add(num);
			if(lotto.size() ==6) {
				break;
			}
		}
		System.out.println("로또 번호: " + lotto);
	}
}
