package exchange;

public class OutputClass {
	public void printWon(double cw, int returnWon, int won10000, 
			int won5000, int won1000, int won500, 
			int won100, int won50, int won10) {
		System.out.printf("��ȭ �Ž����� : %.2f ��%n", cw);
		System.out.printf("��ȭ �Ž����� ���� : %d ��%n", returnWon);
		System.out.println("*10000�� : " + won10000 + " ��");
		System.out.println("*5000�� : " + won5000 + " ��");
		System.out.println("*1000�� : " + won1000 + " ��");
		System.out.println("*500�� : " + won500 + " ��");
		System.out.println("*100�� : " + won100 + " ��");
		System.out.println("*50�� : " + won50 + " ��");
		System.out.println("*10�� : " + won10 + " ��");
	}

	public void printUSD(double usdResult, int usd, int usd100,
			int usd50, int usd20, int usd10,
			int usd5, int usd2, int usd1) {
		System.out.printf("�޷� ȯ�� ��� : %.2f �޷�%n", usdResult);
		System.out.println("�޷� ���� : " + usd + " �޷�");
		System.out.println("*100�޷� : " + usd100 + " ��");
		System.out.println("*50�޷� : " + usd50 + " ��");
		System.out.println("*20�޷� : " + usd20 + " ��");
		System.out.println("*10�޷� : " + usd10 + " ��");
		System.out.println("*5�޷� : " + usd5 + " ��");
		System.out.println("*2�޷� : " + usd2 + " ��");
		System.out.println("*1�޷� ���� : " + usd1 + " ��");
	}
	
	public void printEUR(double eurResult, int eur, int eur100, 
			int eur50, int eur20, int eur10, int eur5) {
		System.out.printf("���� ȯ�� ��� : %.2f ����%n", eurResult);
		System.out.println("���� ���� : " + eur + " ����");
		System.out.printf("*100���� : %d ��%n", eur100);
		System.out.printf("*50���� : %d ��%n", eur50);
		System.out.printf("*20���� : %d ��%n", eur20);
		System.out.printf("*10���� : %d ��%n", eur10);
		System.out.printf("*5���� : %d ��%n", eur5);
		
	}
	
	public void printJPY(double jpyResult, int jpy, int jpy10000, 
			int jpy5000, int jpy2000, int jpy1000) {
		System.out.printf("��ȭ ȯ�� ��� : %.2f ��\n", jpyResult);
		System.out.println("��ȭ ���� : " + jpy + " ��");
		System.out.println("*10000�� : " + jpy10000 + " ��");
		System.out.println("*5000�� : " + jpy5000 + " ��");
		System.out.println("*2000�� : " + jpy2000 + " ��");
		System.out.println("*1000�� : " + jpy1000 + " ��");
	}
}
