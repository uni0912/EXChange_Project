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
		int ticketSelect = 0;
		System.out.println("������ �����ϼ���");
		System.out.println("1. �ְ���");
		System.out.println("2. �߰���");
		try {
			ticketSelect = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ticketSelect;
	}
	
	public int inputCustomerIDNumber() { //�������Է�
		int customerIDNumber = 0;
		System.out.println("��������� �Է��ϼ���");
		try {
			customerIDNumber = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return customerIDNumber;
	}
	
	public int inputTicketCount() { //�ֹ������Է�
		int ticketCount = 0;
		System.out.println("��� �ֹ��Ͻðڽ��ϱ�?(�ִ�10��)");
		try {
			ticketCount = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ticketCount;
	}
	
	public int inputDiscountSlect() { //������ �Է�
		int discountSelect = 0;
		System.out.println("�������� �����ϼ���.");
		System.out.println("1. ����(���� ���� �ڵ�ó��");
		System.out.println("2. �����");
		System.out.println("3. ����������");
		System.out.println("4. ���ڳ�");
		System.out.println("5. �ӻ��");
		try {
			discountSelect = scanner.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return discountSelect;
	}
}
