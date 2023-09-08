package day16.file.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class quiz2 implements Comparable<quiz2> {

	String name;
	int ban;
	int no;
	int kor, eng, math;
	public quiz2(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return "quiz2 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return getTotal()/3f;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ban;
		result = prime * result + eng;
		result = prime * result + kor;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		quiz2 other = (quiz2) obj;
		if (ban != other.ban)
			return false;
		if (eng != other.eng)
			return false;
		if (kor != other.kor)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		return true;
	}
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new quiz2("샐리", 3, 27, 94, 77, 99));
		list.add(new quiz2("발락", 2, 13, 88, 98, 58));
		list.add(new quiz2("범근", 1, 1, 76, 52, 100));
		
		Collections.sort(list);
		Iterator it = list.iterator();
		
		
		
		
		
	}


	@Override
	public int compareTo(quiz2 o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
	
	
	
	
}
