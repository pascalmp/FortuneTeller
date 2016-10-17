package calproject;

import java.util.Scanner;

public class GPACalculator {

	public static void main(String[] args) {
		
		// 
		Scanner money = new Scanner(System.in);
		
		System.out.println("How many Silver/Gold  dollars do you have?: ");
		double firstValue  = money.nextDouble()*1;
		
		System.out.println("How many quaters do you have?: ");
		double secondValue = money.nextDouble()*0.25;
		
		System.out.println("How many dimes do you have?: ");
		double thirdValue = money.nextDouble()*0.10;
		
		System.out.println("How many nickels do you have?: ");
		double forthValue = money.nextDouble()*0.5;
		
		System.out.println("How amny pennies do you have?: ");
		double fifthValue = money.nextDouble()*0.1;
		
		
		double sum = firstValue + secondValue + thirdValue + forthValue + fifthValue; 
		/*System.out.print("$");*/ 
		System.out.println("$" + sum);
		 
		 money.close();
		 

		
	}

}
