package day17.filterstream.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import util.Closure;

public class WriteCustomerExample {

	public static void main(String[] args) {
		Customer cust1 = new Customer("홍길동", 'M', "hkd@test.com", 30);
		Customer cust2 = new Customer("홍길년", 'F', "hknw@test.com", 82);
		
		File file = new File("E:\\Develop\\Java\\FirstJAVA\\file\\customer.ser");
		
		// 객체 선언
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			//객체 생성
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cust1);
			oos.writeObject(cust2);
			
			ArrayList<Customer> list = new ArrayList<Customer>();
			list.add(cust1);
			list.add(cust2);
			oos.writeObject(list);
			System.out.println("Customer 데이터가 저장됐단다.");
			// 엔티티 객체를 직접 파일 시스템에 저장할 수 있다. 컬렉션 객체에 저장되어 있는 경우
			// 컬렉션 객체를 직렬화 할 수 있다.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if((oos != null)) Closure.close(oos);
			if((fos != null)) Closure.close(fos);
		}
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Customer cus1 = (Customer) ois.readObject();
			Customer cus2 = (Customer) ois.readObject();
			@SuppressWarnings("unchecked")
			ArrayList<Customer> list = (ArrayList<Customer>) ois.readObject();
			
			System.out.println("출력: " + cus1 +"\n"+ cus2 +"\n"+ list);
		} catch (FileNotFoundException e) {
			System.out.println("파일 f없다");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			
		} finally {
			try {
				if(fis!=null) Closure.close(fis);
				if(ois!=null) Closure.close(ois);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
