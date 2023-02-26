package week3.day1;
import java.util.Arrays;

public class MissingElementInArray{
	public static void main(String[] args) {
		//declare the array values
			int[] arr= {1,4,2,5,7,6,8,9};
			//sort the given array valeus by using sort method
			Arrays.sort(arr);
			// declare the variable j as 0
			int j=0;
			//initialize the i value as 0
			//iterate the values
			for(int i=0;i<arr.length;i++){
				//add 1 with j value
				j=j+1;
	//compare the arr[i] and j values, the given two values are not equal and execute if cpndition
				if(arr[i]!=j) {
					//print j
				System.out.println(j);
				//break the loop
				break;
				}
			}	
			
		}


}
