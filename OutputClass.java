package exchange;

public class OutputClass {
	public void printWon(double cw, int returnWon, int won10000, 
			int won5000, int won1000, int won500, 
			int won100, int won50, int won10) {
		System.out.printf("원화 거스름돈 : %.2f 원%n", cw);
		System.out.printf("원화 거스름돈 지급 : %d 원%n", returnWon);
		System.out.println("*10000원 : " + won10000 + " 장");
		System.out.println("*5000원 : " + won5000 + " 장");
		System.out.println("*1000원 : " + won1000 + " 장");
		System.out.println("*500원 : " + won500 + " 개");
		System.out.println("*100원 : " + won100 + " 개");
		System.out.println("*50원 : " + won50 + " 개");
		System.out.println("*10원 : " + won10 + " 개");
	}

	public void printUSD(double usdResult, int usd, int usd100,
			int usd50, int usd20, int usd10,
			int usd5, int usd2, int usd1) {
		System.out.printf("달러 환전 결과 : %.2f 달러%n", usdResult);
		System.out.println("달러 지급 : " + usd + " 달러");
		System.out.println("*100달러 : " + usd100 + " 장");
		System.out.println("*50달러 : " + usd50 + " 장");
		System.out.println("*20달러 : " + usd20 + " 장");
		System.out.println("*10달러 : " + usd10 + " 장");
		System.out.println("*5달러 : " + usd5 + " 장");
		System.out.println("*2달러 : " + usd2 + " 장");
		System.out.println("*1달러 지폐 : " + usd1 + " 장");
	}
	
	public void printEUR(double eurResult, int eur, int eur100, 
			int eur50, int eur20, int eur10, int eur5) {
		System.out.printf("유로 환전 결과 : %.2f 유로%n", eurResult);
		System.out.println("유로 지급 : " + eur + " 유로");
		System.out.printf("*100유로 : %d 장%n", eur100);
		System.out.printf("*50유로 : %d 장%n", eur50);
		System.out.printf("*20유로 : %d 장%n", eur20);
		System.out.printf("*10유로 : %d 장%n", eur10);
		System.out.printf("*5유로 : %d 장%n", eur5);
		
	}
	
	public void printJPY(double jpyResult, int jpy, int jpy10000, 
			int jpy5000, int jpy2000, int jpy1000) {
		System.out.printf("엔화 환전 결과 : %.2f 엔\n", jpyResult);
		System.out.println("엔화 지급 : " + jpy + " 엔");
		System.out.println("*10000엔 : " + jpy10000 + " 장");
		System.out.println("*5000엔 : " + jpy5000 + " 장");
		System.out.println("*2000엔 : " + jpy2000 + " 장");
		System.out.println("*1000엔 : " + jpy1000 + " 장");
	}
}
