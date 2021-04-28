package kopoland;

import java.text.ParseException;
import java.util.ArrayList;

public class KopoMain {
	static InputClass input;
	static ProcessingClass pc;
	static OutputClass out;
	static ArrayList<String> orderList;
	static int totalPrice;
	
	public static void main(String[] args) throws ParseException {
				
		do {
			input = new InputClass();
			pc = new ProcessingClass();
			out = new OutputClass();
			orderList = new ArrayList<String>();
			totalPrice = 0;
			while (true) {

				input.inputAll();

				pc.calcAge(VariableValueClass.customerIDNumber);
				pc.calcAgeGroup(VariableValueClass.age);
				int calcPrice = pc.calcPriceProcess(VariableValueClass.ticketSelect, VariableValueClass.age);
				calcPrice = pc.calcDiscount(calcPrice, VariableValueClass.discountSelect);
				VariableValueClass.resultPrice = pc.calcResultPrice(calcPrice, VariableValueClass.ticketCount);
				totalPrice += VariableValueClass.resultPrice;
				pc.saveOrderList(orderList);
				input.inputOrderContinue();
				if (VariableValueClass.orderContinue == 2) {
					break;
				}
			}
			out.printResultReport(orderList, totalPrice);
			input.inputProgram();

		} while (VariableValueClass.programSelect != 2);
	}
}