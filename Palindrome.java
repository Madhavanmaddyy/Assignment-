package week3.day1;

public class Palindrome {
	public static void main(String[] args) {
		
		//Daclare a string 'nameWord'
		String nameWord="madam";
		
		//Convert string into toCharArray
		char[] myName=nameWord.toCharArray();
		//declare a empty string 'rev'
	    String rev="";
	    //Use decrement for loop to iterate the values 
	    for(int i=myName.length-1;i>=0;i--) {
	    	//sum the values of 'rev and myName'
	    	rev=rev+myName[i];
	    }
	    //compare a two string values by using '.equal' method
	    if(nameWord.equals(rev)) {
	    	// print the given string is palindrome
	    	System.out.println("the given string is palindrome");
	    }
	    else {
	    	// print the given string is not palindrome
	    	System.out.println("the given string is not palindrome");
			}
		}
		
		
}
