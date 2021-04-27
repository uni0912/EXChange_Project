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
		System.out.println("권종을 선택하세요");
		System.out.println("1. 주간권");
		System.out.println("2. 야간권");
		VariableValueClass.ticketSelect = scanner.nextInt();
		return VariableValueClass.ticketSelect;
	}
	
	public String inputCustomerIDNumber() { //고객정보입력
		System.out.println("생년월일을 입력하세요");
		VariableValueClass.customerIDNumber = scanner.next();
		return VariableValueClass.customerIDNumber;
	}
	
	public int inputTicketCount() { //주문개수입력
		System.out.println("몇개를 주문하시겠습니까?(최대10개)");
		VariableValueClass.ticketCount = scanner.nextInt();
		return VariableValueClass.ticketCount;
	}
	
	public int inputDiscountSlect() { //우대사항 입력
		System.out.println("우대사항을 선택하세요.");
		System.out.println("1. 없음(나이 우대는 자동처리)");
		System.out.println("2. 장애인");
		System.out.println("3. 국가유공자");
		System.out.println("4. 다자녀");
		System.out.println("5. 임산부");
		VariableValueClass.discountSelect = scanner.nextInt();
		return VariableValueClass.discountSelect;
	}
	
	public int inputOrderContinue() {
		System.out.println("계속 발권 하시겠습니까?");
		System.out.println("1. 티켓 발권");
		System.out.println("2. 종료");
		VariableValueClass.orderContinue = scanner.nextInt();
		return VariableValueClass.orderContinue;
	}
	
	public int inputProgram() {
		System.out.print("계속진행 (1: 새로운주문, 2: 프로그램 종료) :");
		VariableValueClass.programSelect = scanner.nextInt();
		return VariableValueClass.programSelect;
	}
	
	public void inputAll() {
		inputTicketSelect();
		inputCustomerIDNumber();
		inputTicketCount();
		inputDiscountSlect();
	}
}
