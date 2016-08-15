package Q4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// Code that reads two integers

		int x = 0, y = 0;	
		int result = x/y;
		
		Scanner Scan1 = new Scanner(System.in);
		System.out.println("Enter an integer to represent x");
		
      x = Scan1.nextInt();		  
      Scan1.nextLine();
      
      System.out.println("Enter an integer to represent y");
      y = Scan1.nextInt();
      Scan1.nextLine();
      
      System.out.println("The result is:" + result);
		
		
				
				
				
	}

}
