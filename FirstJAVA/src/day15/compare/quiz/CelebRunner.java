package day15.compare.quiz;

import java.util.TreeSet;

public class CelebRunner {

	public static void main(String[] args) {
		
		TreeSet<CelebList> tset = new TreeSet<CelebList>();
		tset.add(new CelebList("박지성", 1000));
		tset.add(new CelebList("김연아", 1001));
		
//		tset.add(c1);
//		tset.add(c2);
//		tset.add(c3);
//		tset.add(c4);
//		tset.add(c5);
//		tset.add(c6);
//		tset.add(c7);
//		
		System.out.println("--------------------Comparable--------------------");
		for(CelebList cel : tset) {
			System.out.println(cel);
		}
		System.out.println();
		
//		TreeSet<CelebList> tset2 = new TreeSet<CelebList>(new Comparator<CelebList>() {
//			@Override
//			public int comare(CelebList o1, CelebList o2) {
//				// compare 메서드사용법 (o1o2 -> 자리바꾸면 1, 그대로 -1, 같으면 0
//				if(o1.name.charAt(0)<o2.name.charAt(0)) {
//					return -1;
//				} else if(o1.name.charAt(0)> o2.name.charAt(0)) {
//					return 1;
//				} else {
//					return 0;
//				}
//			}
//			
//		}   // 이렇게 하면 charAt(0)이라 같은 박씨인 뒤에 들어온 박찬호가 출력이 안된다.
		
		TreeSet<CelebList> tset2 = new TreeSet<CelebList>();
		CelebList c1 = new CelebList("박지성", 1000);
		CelebList c2 = new CelebList("김연아", 1001);
		CelebList c3 = new CelebList("싸이", 1002);
		CelebList c4 = new CelebList("봉준호", 1003);
		CelebList c5 = new CelebList("조현우", 1004);
		CelebList c6 = new CelebList("BTS", 1005);
		CelebList c7 = new CelebList("박찬호", 1006);
		
		tset2.add(c1);
		tset2.add(c2);
		tset2.add(c3);
		tset2.add(c4);
		tset2.add(c5);
		tset2.add(c6);
		tset2.add(c7);
		System.out.println("--------------------Comparator--------------------");
		for(CelebList cel2 : tset2) {
			System.out.println(cel2);
		}
		System.out.println();

	}

}
