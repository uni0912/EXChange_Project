package kopoland;

import java.util.Scanner;

public class InputClass {
	Scanner scanner = null;
	
	InputClass() { //������ �Է�
		scanner = new Scanner(System.in);
	}
	
	protected void finalize() {
		scanner.close();
	}

	public int inputTicketSelect() { //���� ����
		System.out.println("������ �����ϼ���");
		System.out.println("1. �ְ���");
		System.out.println("2. �߰���");
		VariableValueClass.ticketSelect = scanner.nextInt();
		return VariableValueClass.ticketSelect;
	}
	
	public String inputCustomerIDNumber() { //�������Է�
		System.out.println("��������� �Է��ϼ���");
		VariableValueClass.customerIDNumber = scanner.next();
		return VariableValueClass.customerIDNumber;
	}
	
	public int inputTicketCount() { //�ֹ������Է�
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�?(�ִ�10��)");
		VariableValueClass.ticketCount = scanner.nextInt();
		return VariableValueClass.ticketCount;
	}
	
	public int inputDiscountSlect() { //������ �Է�
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ����(���� ���� �ڵ�ó��)");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
		VariableValueClass.discountSelect = scanner.nextInt();
		return VariableValueClass.discountSelect;
	}
	
	public int inputOrderContinue() {
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
		VariableValueClass.orderContinue = scanner.nextInt();
		return VariableValueClass.orderContinue;
	}
	
	public int inputProgram() {
		System.out.print("������� (1: ���ο��ֹ�, 2: ���α׷� ����) :");
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
