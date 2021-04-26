package exchange;

import java.io.IOException;

public class ExchangeMain {

	public static void main(String[] args) throws IOException {
		ExchangeType exType; //변수선언 클래스를 생성
		ProcessingClass pc;	//계산 클래스를 생성
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		//인풋 클래스를 생성
		FileWriteClass fwc = new FileWriteClass(); //파일작성 클래스 생성
		
		fwc.headerWrite(); //헤더쓰는 메소드 호출
		
		do {	//일단 한번이라도 실행시키기 위해 do~while문을 사용
			exType = new ExchangeType();
			pc = new ProcessingClass();
			inputConsole.inputAll(exType); //변수선언클래스를 인풋클래스의 함수와 연결
			
			if (exType.type == ConstValueClass.EX_TYPE_EXIT) {	//상수 클래스의 종료타입
				break;
			
			} else if (exType.type == ConstValueClass.EX_TYPE_USD) {	//상수 클래스의 달러타입
				exType.cw = pc.exchangeUSD(exType.w);
				exType.exchangetype = "USD";
				exType.exchange = pc.usdResult;
				exType.exchangeresult = pc.usd;
			
			} else if(exType.type == ConstValueClass.EX_TYPE_EUR) {	//상수 클래스의 유로타입
				exType.cw = pc.exchangeEUR(exType.w);
				exType.exchangetype = "EUR";
				exType.exchange = pc.eurResult;
				exType.exchangeresult = pc.eur;
			
			} else if(exType.type == ConstValueClass.EX_TYPE_JPY) {	//상수 클래스의 엔화타입
				exType.cw = pc.exchangeJPY(exType.w);
				exType.exchangetype = "JPY";
				exType.exchange = pc.jpyResult;
				exType.exchangeresult = pc.jpy;
			
			} else {
				System.out.println("올바른 값을 입력하세요.");	//잘못된 값 입력시 출력될 문구
			}
			
			pc.returnWon(exType.cw);	//계산 클래스의 원화 거스름돈계산 메소드 호출
			exType.returnWon = pc.returnWon;
			fwc.dataWrite(exType);
		
		} while(exType.type != ConstValueClass.EX_TYPE_EXIT);	
		//입력받은 타입이 종료타입이 아니라면 계속 실행된다.
		fwc.fileClose();
	}
}