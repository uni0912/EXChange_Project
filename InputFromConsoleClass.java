package exchange;

import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scanner = null;
	InputFromConsoleClass() {	//생성자 설정
		scanner = new Scanner(System.in);
	}
	
	protected void finalize() {
		scanner.close();	//스캐너 닫아준다
	}
	
	public double inputWon() {	//받은 원화 입력 메소드
		double w;
		System.out.print("받은 원화 입력 : ");
		w = scanner.nextInt();
		return w;
	}
	
	public int inputType() {	//환전할 종류 선택 입력 메소드
		int type;
		System.out.print("환전할 종류 선택(0:종료 1:USD, 2:EUR, 3:JPY) ? ");
		type = scanner.nextInt();
		return type;
	}
	
	public ExchangeType inputAll(ExchangeType exType) {
		exType.w = inputWon(); //인풋 클래스의 받은 원화입력 메소드 호출
		exType.type = inputType(); //인풋 클래스의 타입입력 메소드 호출
		return exType;
	}
}