package exchange;

import java.io.IOException;

public class ExchangeMain {

	public static void main(String[] args) throws IOException {
		ExchangeType exType; //�������� Ŭ������ ����
		ProcessingClass pc;	//��� Ŭ������ ����
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		//��ǲ Ŭ������ ����
		FileWriteClass fwc = new FileWriteClass(); //�����ۼ� Ŭ���� ����
		
		fwc.headerWrite(); //������� �޼ҵ� ȣ��
		
		do {	//�ϴ� �ѹ��̶� �����Ű�� ���� do~while���� ���
			exType = new ExchangeType();
			pc = new ProcessingClass();
			inputConsole.inputAll(exType); //��������Ŭ������ ��ǲŬ������ �Լ��� ����
			
			if (exType.type == ConstValueClass.EX_TYPE_EXIT) {	//��� Ŭ������ ����Ÿ��
				break;
			
			} else if (exType.type == ConstValueClass.EX_TYPE_USD) {	//��� Ŭ������ �޷�Ÿ��
				exType.cw = pc.exchangeUSD(exType.w);
				exType.exchangetype = "USD";
				exType.exchange = pc.usdResult;
				exType.exchangeresult = pc.usd;
			
			} else if(exType.type == ConstValueClass.EX_TYPE_EUR) {	//��� Ŭ������ ����Ÿ��
				exType.cw = pc.exchangeEUR(exType.w);
				exType.exchangetype = "EUR";
				exType.exchange = pc.eurResult;
				exType.exchangeresult = pc.eur;
			
			} else if(exType.type == ConstValueClass.EX_TYPE_JPY) {	//��� Ŭ������ ��ȭŸ��
				exType.cw = pc.exchangeJPY(exType.w);
				exType.exchangetype = "JPY";
				exType.exchange = pc.jpyResult;
				exType.exchangeresult = pc.jpy;
			
			} else {
				System.out.println("�ùٸ� ���� �Է��ϼ���.");	//�߸��� �� �Է½� ��µ� ����
			}
			
			pc.returnWon(exType.cw);	//��� Ŭ������ ��ȭ �Ž�������� �޼ҵ� ȣ��
			exType.returnWon = pc.returnWon;
			fwc.dataWrite(exType);
		
		} while(exType.type != ConstValueClass.EX_TYPE_EXIT);	
		//�Է¹��� Ÿ���� ����Ÿ���� �ƴ϶�� ��� ����ȴ�.
		fwc.fileClose();
	}
}