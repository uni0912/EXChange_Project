package kopoland;

import java.util.Scanner;

public class InputClass {
	Scanner scanner = null;
	
	InputClass() { //생성자 입력
		scanner = new Scanner(System.in);
	}
	
	protected void finalize() {
		scanner.close();
	}

	public int inputTicketSelect() { //권종 선택
		int ticketSelect = 0;
		System.out.println("권종을 선택하세요");
		System.out.println("1. 주간권");
		System.out.println("2. 야간권");
		try {
			ticketSelect = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ticketSelect;
	}
	
	public int inputCustomerIDNumber() { //고객정보입력
		int customerIDNumber = 0;
		System.out.println("생년월일을 입력하세요");
		try {
			customerIDNumber = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return customerIDNumber;
	}
	
	public int inputTicketCount() { //주문개수입력
		int ticketCount = 0;
		System.out.println("몇개를 주문하시겠습니까?(최대10개)");
		try {
			ticketCount = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ticketCount;
	}
	
	public int inputDiscountSlect() { //우대사항 입력
		int discountSelect = 0;
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1. 없음(나이 우대는 자동처리");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
		try {
			discountSelect = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return discountSelect;
	}
}
