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
		
		return VariableValueClass.ticketSelect = scanner.nextInt();
	}
	
	public String inputCustomerIDNumber() { //�������Է�
		System.out.println("��������� �Է��ϼ���");
		
		return VariableValueClass.customerIDNumber = scanner.next();
	}
	
	public int inputTicketCount() { //�ֹ������Է�
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�?(�ִ�10��)");
		
		return VariableValueClass.ticketCount = scanner.nextInt();
	}
	
	public int inputDiscountSlect() { //������ �Է�
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ����(���� ���� �ڵ�ó��");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
		
		return VariableValueClass.discountSelect = scanner.nextInt();
	}
	
	public int inputOrderContinue() {
		System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
		System.out.println("1. Ƽ�� �߱�");
		System.out.println("2. ����");
		
		return VariableValueClass.orderContinue = scanner.nextInt();
	}
}
