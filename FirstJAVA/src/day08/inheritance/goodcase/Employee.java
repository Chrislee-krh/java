package day08.inheritance.goodcase;

import day08.inheritance.Person;

public class Employee extends Person {
	// 사번, 부서
	
	public String companyId;
	public String department;
	
	public String getDetail() {
		return "이름: " +name+ "나이: " +age+ "사번: " +companyId+ "\t부서: " +department;
	}
	
}
