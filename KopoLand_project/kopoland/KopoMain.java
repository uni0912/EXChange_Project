package kopoland;

import java.text.ParseException;

public class KopoMain {

	public static void main(String[] args) throws ParseException {
		InputClass input;
		ProcessingClass pc;
		
		do {
			input = new InputClass();
			pc = new ProcessingClass();
			
			input.inputTicketSelect();
			input.inputCustomerIDNumber();
			input.inputTicketCount();
			input.inputDiscountSlect();
			
			pc.calcAge(VariableValueClass.customerIDNumber);
			pc.calcAgeGroup(VariableValueClass.age);
			int calcPrice = pc.calcPriceProcess(VariableValueClass.ticketSelect, VariableValueClass.age);
			calcPrice = pc.calcDiscount(calcPrice, VariableValueClass.discountSelect);
			int resultPrice = pc.calcResultPrice(calcPrice, VariableValueClass.ticketCount);
			input.inputOrderContinue();
			
			
			
		} while (VariableValueClass.orderContinue != 2);

	}

}
