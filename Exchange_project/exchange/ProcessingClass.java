package exchange;

public class ProcessingClass {
	OutputClass outClass = null;
	
	ProcessingClass() {
		outClass = new OutputClass();
	}
	//다른클래스에서 호출하기 위해 변수 선언
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
		returnWon =(int)(cw/10)*10;	//원화 거스름돈을 10원이하 버림
		
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
		//출력클래스에서 원화거스름돈 출력함수를 호출함
	}
	
	public double exchangeUSD(double w) {
		double cw;
		int usd100, usd50, usd20, usd10, usd5, usd2, usd1;
		
		usdResult = w / ConstValueClass.EX_RATE_USD;	//원화를 달러환율로 나눈 달러
		usd = (int)usdResult;	//달러를 지폐로만 주기위해 소수점 아래 버림
		cw = (usdResult - usd) * ConstValueClass.EX_RATE_USD;
		//소수점 아래 버린 값은 다시 원화로 거슬러줌
		
		usd100 = usd / 100;
		usd50 = usd%100/50;
		usd20 = usd%100%50/20;
		usd10 = usd%100%50%20/10;
		usd5 = usd%100%50%20%10/5;
		usd2 = usd%100%50%20%10%5/2;
		usd1 = usd%100%50%20%10%5%2/1;
		
		outClass.printUSD(usdResult, usd, usd100, usd50, usd20, 
							usd10, usd5, usd2, usd1);
		return cw;	//리턴값은 다시 원화로 거슬러줄 돈
	}
		
	public double exchangeEUR(double won) {
		double cw;
		int eur100, eur50, eur20, eur10, eur5;
		
		eurResult = won / ConstValueClass.EX_RATE_EUR;	//원화를 유로환율로 나눈 유로
		eur = (int)eurResult - ((int)eurResult) % 5;	//유로 소수점 아래 버림
		cw = won - eur * ConstValueClass.EX_RATE_EUR;
		//5유로 이하 값은 다시 원화로 거슬러줌
		
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
		
		jpyResult = won / ConstValueClass.EX_RATE_JPY;	//원화를 엔화환율로 나눈 엔화
		jpy = (int)(jpyResult/1000)*1000;	//엔화 백엔이하 버림
		cw = won - jpy * ConstValueClass.EX_RATE_JPY;
		//백엔 이하 값은 다시 원화로 거슬러줌
		
		jpy10000 = jpy / 10000;
		jpy5000 = jpy%10000/5000;
		jpy2000 = jpy%10000%5000/2000;
		jpy1000 = jpy%10000%5000%2000/1000;
		
		outClass.printJPY(jpyResult, jpy, jpy10000, jpy5000, jpy2000, jpy1000);
				
		return cw;	//리턴값은 다시 원화로 거슬러줄 돈
	}
}
