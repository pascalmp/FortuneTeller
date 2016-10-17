package calproject;

public class SumValArrayOne {

	public static void main(String[] args) {
		// Declaring an array
		int[] xyz = new int[4];
		int sum = 0;
		
		//Adding a value into the array
		xyz[0] = 1;
		xyz[1] = 2;
		xyz[2] = 3;
		xyz[3] = 4;
		
		//Print a value from the array 
		for (int z = 0; z < 4; z++){
			System.out.println(xyz[z] + ",");
		    }
		    System.out.println("");
		    
	    //Total of the array
		    for (int z = 0; z < 4; z++){
		    	sum= sum + xyz[z];
		    	System.out.println("The Total the array is  " + sum);
		/* sum+= xyz[z];*/
		}
        System.out.println("");
        System.out.println("The Total the array is  " + sum);
	}

}
