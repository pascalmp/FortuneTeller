package calproject;

import java.util.Scanner;

public class FortuneTellerPro 
	
	
{ 

	public static void main(String[] args) 
	
	{
		
		  Scanner userInput = new Scanner(System.in);
		// Part 1
		  String [] color = new String[7];
		  String [] monthSt = new String[12];
		  int [] digiMonth = new int[12];
		  int [] sibNum = new int[4];
		  
		        color [0] = "Red";
		        color [1] = "Orange";
		        color [2] = "Yellow";
		        color [3] = "Green";
		        color [4] = "Blue";
		        color [5] = "Indigo";
		        color [6] = "Violet";
		        
		              monthSt[0] = "January";
		              monthSt[1] = "February";
		              monthSt[2] = "March";
		              monthSt[3] = "April";
		              monthSt[4] = "May";
		              monthSt[5] = "June";
		              monthSt[6] = "July";
		              monthSt[7] = "August";
		              monthSt[8] = "September";
		              monthSt[9] = "October";
		              monthSt[10] = "November";
		              monthSt[11] = "December";
		              
		                 digiMonth[0] = 1;
		                 digiMonth[1] = 2;
		                 digiMonth[2] = 3;
		                 digiMonth[3] = 4;
		                 digiMonth[4] = 5;
		                 digiMonth[5] = 6;
		                 digiMonth[6] = 7;
		                 digiMonth[7] = 8;
		                 digiMonth[8] = 9;
		                 digiMonth[9] = 10;
		                 digiMonth[10] = 11;
		                 digiMonth[11] = 12;
		                 
		              
		                   sibNum [0] = 1;
		                   sibNum [1] = 2;
		                   sibNum [2] = 3;
		                   sibNum [3] = 4;
		              
		            		  
		  
		       
		//Ask user to input info and store them
		
		
		   System.out.println("What is your first name? ");
		   String firstName = userInput.next();
		   
		   System.out.println("What is your last name? ");
		   String lastName = userInput.next();
		   
//User age defines in what year they will retire
		   
		   System.out.println("What is your age? ");
		   int userAge = userInput.nextInt();
		   

 		   
		   System.out.println("What is your birth month? ");
		   
		   //String bMonth = userInput.next(String [] monthST);
		   int birthMonth = userInput.nextInt();
		   
		   
//User ROYGBIV fav color defines their mode of transportation
		   
		   System.out.println("WHat is your favorite ROYGBIV color? "
		   		+ "If you don't know what ROYGBIV is please type \"Help\"");
		   String favROY = userInput.next("Help");
		   
		      
		   
		   System.out.println("ROYGBIV stands for :" + color[0]+", " + color[1] +", "+ color[2]+", "+ color [3]+", "+ color[4]+", " + color[5]+", " + color[6]);
		   String favROY1 = userInput.next();
		   
//User number of siblings defines which location they will live in	 	   
		   
		   System.out.println("How many sibblings do you have? ");
		   int userSibblings = userInput.nextInt();
		   
		   
		 //Part Two
		 //Conditions
		   //1)Age odd or even
		   if (userAge %2 == 0)
		   {System.out.println("Will retire in 10 years ");}
		    
		   else {
			   System.out.println("will retire in 6 years ");
		   }
		   
		  
			
			
			System.out.println(firstName +""+ lastName    );
			userInput.close();
			
	}

}
