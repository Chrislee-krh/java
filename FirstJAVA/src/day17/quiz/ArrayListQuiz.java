package day17.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.*;
import java.util.Scanner;

import util.Closure;

public class ArrayListQuiz {

	public static void main(String[] args) {
		//1. User를 저장하는 List를 선언하세요
			
			ArrayList<Customer> user = new ArrayList<Customer>();
			Scanner scan = new Scanner(System.in);

			while(true) {

				System.out.println("메뉴를 입력하세요.");
				System.out.println("[ 1. 회원 등록 | 2. 전체 회원 정보 보기 | 3. 회원정보 검색 | 4. 회원정보 삭제 | 5. 종료 ]");
				System.out.print(">>> ");
				int menu = scan.nextInt();

				if(menu == 1) {
					/*
					Scanner를통해 이름과, 나이를 입력받고 User객체에 저장합니다.
					그리고 User객체를 list에 추가하세요.
					*/
					
					System.out.print("이름을 입력하세요: ");
					String name = scan.next();
				    System.out.println();	
//					scan.nextLine();
				    
					System.out.print("나이를 입력하세요: ");
					int age = scan.nextInt();
					scan.nextLine();
					
					Customer users = new Customer(name, age);
	
					File file = new File("E:\\Develop\\Java\\FirstJAVA\\file\\customerQ.txt");
					
					FileOutputStream fos = null;
					ObjectOutputStream oos = null;
							
					try {
						fos = new FileOutputStream(file);
						oos = new ObjectOutputStream(fos);
					
							
							user.add(users);
							oos.writeObject(user);
						
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							if(fos != null) Closure.close(fos);
							if(oos != null) Closure.close(oos);
						} catch (Exception e2) {}
					}
				
					
				}else if(menu == 2) {
					
					System.out.println("====== 모든 회원 정보 ======");
					/*
					 * user의 길이만큼 회전하면서 user의객체를 꺼내 저장합니다. (객체의 타입에 유의)
					 * 꺼낸 하나의 객체에서  공개된 메서드를 통해 이름, 나이를 출력하세요.
					 * 
					 */
					
					for(int i = 0; i<user.size();i++) {
						Customer c = user.get(i);
						String cName = c.getName();
						String cAge = c.getAge();
						System.out.println(cName + "::" + cAge );
						
					}
					
					
//					File file = new File("E:\\Develop\\Java\\FirstJAVA\\file\\customerQ.txt");
//					FileInputStream fis = null;
//					ObjectInputStream ois = null;
//					try {
//						fis = new FileInputStream(user);
//						ois = new ObjectInputStream(fis);
//						System.out.println("해당 고객 정보: " + ois.readObject());
//					} catch (Exception e2) {
//						e2.printStackTrace();
//					} finally {
//						try {
//							if(fis != null) Closure.close(fis);
//							if(ois != null) Closure.close(ois);
//						} catch (Exception e2) {}
//					}	
//				
					System.out.println("==========================");

					
				}else if(menu == 3) {
					System.out.println("찾을 이름을 입력하세요.");
					System.out.print(">>> ");
					String name = scan.next();
					
					
					for(int i=0; i<user.size(); i++) {
						Customer u = user.get(i);
						String uName = u.getName();
						
						if(uName.equals(name)) {
							System.out.println("이름: " + name + ", 나이: " + u.getAge());
							break;
						} 
						//people List의 인덱스는 size -1이 됩니다.
						if (i == user.size() -1) {
							System.out.println(name +"님은 목록에 없습니다.");
						}
					}	

						
				}else if(menu == 4) {
					/*
					 * 1. scan 을 통해 삭제할 이름을 입력 받으세요.
					 * 2. list 의 길이 만큼 회전하면서 객체에서 name을 꺼내 비교합니다.
					 * 3. 입력받은 이름과 동일한 이름이 있다면 people객체를 삭제
					 * 
					 */
					
					System.out.print("지워버릴 인간의 이름을 입력하라: ");
			
					String name = scan.next();
					
					for(int i=0; i<user.size();i++) {
						
						Customer u = (Customer) user.get(i);
						String uName = u.getName();
						
						if(uName.equals(name)) {
							user.remove(i);
						} 
					}
	
				}else if(menu == 5) {
					System.out.println("프로그램을 종료합니다.");
					scan.close();
					break;
				}	
			}
	}

}