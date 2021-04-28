package kopoland;

import java.text.ParseException;
import java.util.ArrayList;

public class KopoMain {

	public static void main(String[] args) throws ParseException {
		InputClass input;
		ProcessingClass pc;
		OutputClass out;
		
		
		while(VariableValueClass.programSelect != 2) {
			ArrayList<String> orderList = new ArrayList<String>();
			int totalPrice = 0;
			do {
				input = new InputClass();
				pc = new ProcessingClass();
				out = new OutputClass();

				input.inputAll();

				pc.calcAge(VariableValueClass.customerIDNumber);
				pc.calcAgeGroup(VariableValueClass.age);
				int calcPrice = pc.calcPriceProcess(VariableValueClass.ticketSelect, VariableValueClass.age);
				calcPrice = pc.calcDiscount(calcPrice, VariableValueClass.discountSelect);
				VariableValueClass.resultPrice = pc.calcResultPrice(calcPrice, VariableValueClass.ticketCount);
				totalPrice += VariableValueClass.resultPrice;
				pc.saveOrderList(orderList);
				input.inputOrderContinue();

			} while (VariableValueClass.orderContinue != 2);
			out.printResultReport(orderList, totalPrice);
			input.inputProgram();
		}
	}
}
