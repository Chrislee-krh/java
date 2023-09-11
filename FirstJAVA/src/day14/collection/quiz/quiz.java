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