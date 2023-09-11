package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.management.StringValueExp;

import day07.customanager.oop.Customer;
import util.Closure;

public class CustomerManager {
//	static Map<String, Customer> cusMapList = new HashMap<>();
	static List<Customer> cusList = new ArrayList<Customer>();
	static Scanner scan = new Scanner(System.in);
	
	File savedFile = null;
	String savedPath = "E:\\develop\\Java\\FirstJAVA\\file\\customerManager.txt";
	
	public static void main(String[] args) {
		loadMember();
		
		while(true) {
			System.out.println("==== What to do ====");			
			System.out.println("1. New Customer");
			System.out.println("2. Print All Customers");
			System.out.println("3. Find info");
			System.out.println("4. Update");
			System.out.println("5. Delete");
			System.out.println("6. Exit");
			System.out.println("> ");
			int behavior = scan.nextInt();
			scan.nextLine();
			
			switch (behavior) {
			case 1:
				insertCustomerData();
				break;
			case 2:			
				printAllCustomerData();
				break;
			case 3:
				findInfo();
				break;
			case 4:		
				updateCustomerData();
				break;
			case 5:
				deleteCustomerData();
				break;
			case 6:
				exitCM();
				break;
			default:
				break;
		
			}
		}		
	}


public static void loadMember() {
	File f = new File("E:\\develop\\Java\\FirstJAVA\\file\\customerManager.txt");
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	String code = null;
	
	try {
		ois = new ObjectInputStream(new FileInputStream(f));
		String line = null;
		while((line = ois.readLine())!=null) {
			String[] eachInfo = line.split(" ");
//			System.out.println(Arrays.toString(eachInfo));
			String name = eachInfo[0].replace(":", "");
			String gender = eachInfo[1].replace(",", "");
			String email = eachInfo[2].replace(",", "");
			int birthYear = Integer.parseInt(eachInfo[3]);
			
			Customer c1 = new Customer();
			c1.setName(name);
			c1.setGender(gender);
			c1.setEmail(email);
			c1.setBirthYear(birthYear);
			cusList.add(c1);
			
//			cusMapList.put(name, customer);
//			
//			Customer cusInfo = cusMapList.get(name);
//		    Info retrievedValue = cusInfo.getInfo();
		
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if(ois!= null) 		
			try {Closure.close(ois);} catch (Exception e2) {}
	}
//		if(fr!= null) 		
//			try {Closure.close(fr);} catch (Exception e2) {}
}
	
public static void insertCustomerData() {
	System.out.print("이름: ");
	String name = scan.next();
	scan.nextLine();
	System.out.print("성별(M/F): ");
	String gender = scan.next();
	scan.nextLine();
	System.out.print("이메일 주소를 입력하세요: ");
	String email = scan.next();
	scan.nextLine();
	System.out.print("출생년도를 입력하세요: ");
	int birthYear = scan.nextInt();
	scan.nextLine();
	
	// 고객 객체를 배열에 저장(Customer 클래스의 객체)
	Customer c1 = new Customer();
	c1.setName(name);
	c1.setGender(gender);
	c1.setEmail(email);
	c1.setBirthYear(birthYear);
	cusList.add(c1);
	saveMember(name + ": " + gender+", "+email+", "+birthYear);
}

public static void saveMember(String content) {
	
	File f = new File("E:\\develop\\Java\\FirstJAVA\\file\\customerManager.txt");
	
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	
	try {
		oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(content);
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if(fos != null)
			try {Closure.close(fos);} catch (Exception e2) {}
		if(oos != null)
			try {Closure.close(oos);} catch (Exception e2) {}	
	}
}

public static void printAllCustomerData() {
	for(Customer customer : cusList) {
		System.out.println("Name: " + customer.getName() + ", Gender: " + customer.getGender() 
							+", Email: " + customer.getEmail() + ", BirthYear: " + customer.getBirthYear());
	}
}

public static void findInfo() {
	System.out.println("정보를 찾고 싶은 회원의 이름을 입력하세요.");
	System.out.print("이름: ");
	String name = scan.nextLine();
	boolean found = false;
	
	for(Customer customer : cusList) {
		if(customer.getName().equals(name)) {
			System.out.println("==========Customer Info==========");
			System.out.println("이름: " + customer.getName());
			System.out.println("성별: "+ customer.getGender());
			System.out.println("이메일: " + customer.getEmail());
			System.out.println("출생년도: " + customer.getBirthYear());
			
			found = true;
		}
		
	}
	if(!found) {
		System.out.println("Not Found");
		return;
	}
}
	
public static void updateCustomerData() {
	System.out.println("정보를 바꾸고 싶은 회원의 이름을 입력하세요.");
	System.out.print("이름: ");
	String name = scan.nextLine();
	boolean found = false;
	
	for(Customer customer : cusList) {
		if(customer.getName().equals(name)) {
			System.out.println("==========Customer Info==========");
			System.out.println("이름: " + customer.getName());
			System.out.println("바꾸기 전 성별: "+ customer.getGender());
			customer.setGender(scan.nextLine());
			System.out.println("바꾸기 전 이메일: " + customer.getEmail());
			customer.setEmail(scan.nextLine());
			System.out.println("바꾸기 전 출생년도: " + customer.getBirthYear());
			customer.setBirthYear(scan.nextInt());
			saveMember(name + ": " + customer.getGender()+", "+ customer.getEmail()+", "+customer.getBirthYear());
			scan.hasNextLine();
			found = true;
		}
	}
	
	if(!found) {
		System.out.println("Not Found");
		return;
	}
}

public static void deleteCustomerData() {
	System.out.println("지우실 회원의 이름을 입력하세요.");
	System.out.print("이름: ");
	String name = scan.nextLine();
	boolean found = false;
	
	Iterator<Customer> iter = cusList.iterator();
	while(iter.hasNext()) {
		Customer customer = iter.next();
		if(customer.getName().equals(name)) {
			iter.remove();
		}
		found = true;
	}
	
	for(Customer customer : cusList) {
			customer.setName(customer.getName());
			customer.setGender(customer.getGender());
			customer.setEmail(customer.getEmail());
			customer.setBirthYear(customer.getBirthYear());
			saveMember(customer.getName() + ": " + customer.getGender()+", "+ customer.getEmail()+", "+customer.getBirthYear());
			scan.hasNextLine();
			found = true;
	}
	if(!found) {
		System.out.println("Not Found");
		return;
	}		
}

public static void exitCM() {
	scan.close();
	System.exit(0);
}

}