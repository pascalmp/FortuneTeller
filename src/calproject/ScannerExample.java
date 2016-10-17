package calproject;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//Create a scanner object
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter your first name");
		 String fName = sc.nextLine();
		 System.out.println("Enter your last name");
		 String lName = sc.nextLine();
		 
		 System.out.println("Enter your height");
		 double myHeight= sc.nextDouble();
		/* System.out.println("My name is" +fName +" " + lName + "")
 +" "*/
	}

}
