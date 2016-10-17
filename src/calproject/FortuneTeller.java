package calproject;

import java.util.Scanner;

public class FortuneTeller {

	private static final int bMonth = 0;

	public static void main(String[] args) {
		// 
		Scanner userInfo = new Scanner(System.in);
		
		System.out.println("WHat's your first name?: ");
		String firstName = userInfo.next();
		//System.out.println(firstName);
		
		System.out.println("WHat's your last name?: ");
		String lastName = userInfo.next();
		//System.out.println(lastName);
		
		System.out.println("WHat is your age? ");
		int userAge = userInfo.nextInt();
		
		System.out.println("WHat is your birth month? ");
		
		
		int userbMonth = userInfo.nextInt();
		
		
		
		int[] bMonth = new int[12];
		  
		    bMonth[0] = 1;
		    bMonth[1] = 2;
		    bMonth[2] = 3;
		    bMonth[3] = 4;
		    bMonth[4] = 5;
		    bMonth[5] = 6;
		    bMonth[6] = 7;
		    bMonth[7] = 8;
		    bMonth[8] = 9;
		    bMonth[9] = 10;
		    bMonth[10] = 11;
		    bMonth[11] = 12;
		    
		    
		    System.out.println("WHat is your favorite ROYGBIV color?");
			String userFavROYGBIV = userInfo.next();    
		    
		/*int age = i.nextInt();
		
	 /*System.out.println("WHat is your birth month?: ");
		
		
	/*	int bMonth = i.nextInt();
		switch(bMonth){
		
		System.out.println(bMonth);
		}
	    
		System.out.println(bMonth); */
		
		
		
		int whatAge;
		
		whatAge = userInfo.nextInt();
		
		if (whatAge %2 == 0)
		
		System.out.println("You will retire in 10 years");
		
		else
		     System.out.println("You will retire in 5 years");
		
		
		  
		int nSibblings;
		String location;
		
		nSibblings = userInfo.nextInt();
		
		switch(nSibblings)
		{
		case 0:
		
		   location = "Cincinati";
		   break;
		case 1:
			location = "Columbus";
			break;
		case 2:
			location = "New York";
			break;
		case 3:
			location = "Paris";
			break;
			
		}
		
		
		
		
		
		userInfo.close();
		
		

	}

}
