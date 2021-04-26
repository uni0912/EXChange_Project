package exchange;

public class ProcessingClass {
	OutputClass outClass = null;
	
	ProcessingClass() {
		outClass = new OutputClass();
	}
	//�ٸ�Ŭ�������� ȣ���ϱ� ���� ���� ����
	public int returnWon;
	public int usd;
	public int eur;
	public int jpy;
	public double usdResult;
	public double eurResult;
	public double jpyResult;
	
	public void returnWon(double cw) {
		int cwResult;
		cwResult = (int)cw;
		returnWon =(int)(cw/10)*10;	//��ȭ �Ž������� 10������ ����
		
		int won10000, won5000, won1000;
		int won500, won100, won50, won10;
				
		won10000 = cwResult/10000;
		won5000 = cwResult%10000/5000;
		won1000 = cwResult%10000%5000/1000;
		won500 = cwResult%10000%5000%1000/500;
		won100 = cwResult%10000%5000%1000%500/100;
		won50 = cwResult%10000%5000%1000%500%100/50;
		won10 = cwResult%10000%5000%1000%500%100%50/10;
		
		outClass.printWon(cw, returnWon, won10000, won5000, 
				won1000, won500, won100, won50, won10);
		//���Ŭ�������� ��ȭ�Ž����� ����Լ��� ȣ����
	}
	
	public double exchangeUSD(double w) {
		double cw;
		int usd100, usd50, usd20, usd10, usd5, usd2, usd1;
		
		usdResult = w / ConstValueClass.EX_RATE_USD;	//��ȭ�� �޷�ȯ���� ���� �޷�
		usd = (int)usdResult;	//�޷��� ����θ� �ֱ����� �Ҽ��� �Ʒ� ����
		cw = (usdResult - usd) * ConstValueClass.EX_RATE_USD;
		//�Ҽ��� �Ʒ� ���� ���� �ٽ� ��ȭ�� �Ž�����
		
		usd100 = usd / 100;
		usd50 = usd%100/50;
		usd20 = usd%100%50/20;
		usd10 = usd%100%50%20/10;
		usd5 = usd%100%50%20%10/5;
		usd2 = usd%100%50%20%10%5/2;
		usd1 = usd%100%50%20%10%5%2/1;
		
		outClass.printUSD(usdResult, usd, usd100, usd50, usd20, 
							usd10, usd5, usd2, usd1);
		return cw;	//���ϰ��� �ٽ� ��ȭ�� �Ž����� ��
	}
		
	public double exchangeEUR(double won) {
		double cw;
		int eur100, eur50, eur20, eur10, eur5;
		
		eurResult = won / ConstValueClass.EX_RATE_EUR;	//��ȭ�� ����ȯ���� ���� ����
		eur = (int)eurResult - ((int)eurResult) % 5;	//���� �Ҽ��� �Ʒ� ����
		cw = won - eur * ConstValueClass.EX_RATE_EUR;
		//5���� ���� ���� �ٽ� ��ȭ�� �Ž�����
		
		eur100 = eur/100;
		eur50 = eur%100/50;
		eur20 = eur%100%50/20;
		eur10 = eur%100%50%20/10;
		eur5 = eur%100%50%20%10/5;
		
		outClass.printEUR(eurResult, eur, eur100, eur50, eur20, eur10, eur5);
		return cw;
	}
				
	public double exchangeJPY(double won) {
		double cw;
		int jpy10000, jpy5000, jpy2000, jpy1000;
		
		jpyResult = won / ConstValueClass.EX_RATE_JPY;	//��ȭ�� ��ȭȯ���� ���� ��ȭ
		jpy = (int)(jpyResult/1000)*1000;	//��ȭ �鿣���� ����
		cw = won - jpy * ConstValueClass.EX_RATE_JPY;
		//�鿣 ���� ���� �ٽ� ��ȭ�� �Ž�����
		
		jpy10000 = jpy / 10000;
		jpy5000 = jpy%10000/5000;
		jpy2000 = jpy%10000%5000/2000;
		jpy1000 = jpy%10000%5000%2000/1000;
		
		outClass.printJPY(jpyResult, jpy, jpy10000, jpy5000, jpy2000, jpy1000);
				
		return cw;	//���ϰ��� �ٽ� ��ȭ�� �Ž����� ��
	}
}
