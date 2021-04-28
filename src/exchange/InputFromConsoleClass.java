package exchange;

import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scanner = null;
	InputFromConsoleClass() {	//������ ����
		scanner = new Scanner(System.in);
	}
	
	protected void finalize() {
		scanner.close();	//��ĳ�� �ݾ��ش�
	}
	
	public double inputWon() {	//���� ��ȭ �Է� �޼ҵ�
		double w;
		System.out.print("���� ��ȭ �Է� : ");
		w = scanner.nextInt();
		return w;
	}
	
	public int inputType() {	//ȯ���� ���� ���� �Է� �޼ҵ�
		int type;
		System.out.print("ȯ���� ���� ����(0:���� 1:USD, 2:EUR, 3:JPY) ? ");
		type = scanner.nextInt();
		return type;
	}
	
	public ExchangeType inputAll(ExchangeType exType) {
		exType.w = inputWon(); //��ǲ Ŭ������ ���� ��ȭ�Է� �޼ҵ� ȣ��
		exType.type = inputType(); //��ǲ Ŭ������ Ÿ���Է� �޼ҵ� ȣ��
		return exType;
	}
}