package day15.compare.quiz;

public class Comparator implements java.util.Comparator<CelebList> {

	@Override
	public int compare(CelebList o1, CelebList o2) {
		
		return o1.name.compareTo(o2.name);
	}

}
