package calproject;

public class SplitString {

	public static void main(String[] args) {
		// Create a String
		String fullname = "Pascal Mpawenayo";
		
		// Split the string and store it inside the array
		String[] eachName = fullname.split(" ");
		
		//Print from the string array
		for(String x : eachName){
			System.out.print(x + "");
		}
		

	}

}
