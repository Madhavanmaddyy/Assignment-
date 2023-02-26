package week3.day1;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		//declare scanner class
		Scanner name=new Scanner(System.in); 
		//print 'enter the value'
		System.out.println("enter the value");
		//declare the string 
		String out=name.nextLine();
		//convert string into char
		char[] b=out.toCharArray();
		//initialize the i value
		//iterate the values
		for(int i=b.length-1;i>=0;i--) {
			//print b[i]
			System.out.println(b[i]);
		}
		
		
		
		
	}

}
