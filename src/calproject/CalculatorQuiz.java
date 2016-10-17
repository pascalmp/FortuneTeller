package calproject;

import java.util.Scanner;

public class CalculatorQuiz {

	public static void main(String[] args) {
		//Create a Scanner object for getting user input 
		
		String answer;
		
		
		Scanner calculator = new Scanner(System.in);
		
		do{
		//Prompt user to input first value and use scanner object and a variable to store their input
		System.out.println("Enter a number: ");
		double fNumber = calculator.nextDouble();
		
		//Prompt the user to input the second value and scanner object and a variable to store their input
		System.out.println("Enter a second number: ");
		double sNumber = calculator.nextDouble();
		
		//Prompt the user to choose an operator and store their input in a variable
		System.out.println("choose an operator (+,-,/,*): ");
		String operator = calculator.next();
		
		switch(operator) 
		{
		case "+":
			System.out.println("Result:");
			System.out.println(fNumber + sNumber);
			break;
		case "-":
			System.out.println("Result:");
			System.out.println(fNumber - sNumber);
			break;
		case "/":
			System.out.println("Result:");
			System.out.println(fNumber / sNumber);
			break;
		case "*":
			System.out.println("Result:");
			System.out.println(fNumber * sNumber);
			break;
		default:
			System.out.println("Not an operator");
			break;
		}
		
		System.out.println("Do you want to do another calculation?");
		
		answer = calculator.next();
		
		}
		while (answer.equals("Yes"));
		
		calculator.close();
		
	}
}

		
		
		
		
		
		

	


