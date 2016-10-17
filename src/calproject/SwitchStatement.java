package calproject;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		char grade = 'D';
		Scanner Grade = new Scanner(System.in);
		
		  switch(grade){
		    case 'A' :
		     System.out.println("Excelent!");
		     break;
		    case 'C' :
		      System.out.println("Well done");
		      break;
		  }

	}

}
