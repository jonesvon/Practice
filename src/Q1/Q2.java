package Q1;
 import java.lang.reflect.Array;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1 = {1,2,22,50,10,63,15}; //set first value at 0 because don't know if it's max
		
		
		int numbers=0;
        int max;	
		max = array1[0];
		while (numbers < array1.length){ //starting at array1
		if (array1[numbers]>max) {
			max = array1[numbers]; //that i assigned the current value i'm on
		
		}
		 numbers++; //breaks the condition at some point
		}	
		
		
		
			System.out.println("The max number is " + max); 
		//need to print maximum number
			
		
		 } 
		
	}
			


	
