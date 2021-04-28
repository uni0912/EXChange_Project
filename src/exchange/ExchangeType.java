package exchange;

public class ExchangeType {
	int type = 0;	//환전할 외화코드
	String exchangetype = ""; //환전할 외화 종류 이름
	double w;	//받은 원화
	double exchange = 0; //단순환전결과
	int exchangeresult = 0; //환전할 외화 지폐결과
	double cw = 0;	//원화 거스름돈 소수점까지
	int returnWon = 0; //원화거스름돈(10원단위)
}