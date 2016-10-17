package calproject;

public class SubStringExample {

	public static void main(String[] args) {
		String xyz = "abcdeffff";
		// To split the string as abc
		
		String myString = xyz.substring(0,4);
		System.out.println(myString);
		
		//to split the string as def
		String myString1 = xyz.substring(3,8);
		System.out.println(myString1);

	}

}
