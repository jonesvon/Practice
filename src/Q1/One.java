package Q1;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 System.out.println("Enter any Number except for 0");
	 Scanner Scan1= new Scanner(System.in);
        int userInput = Scan1.nextInt();
       int j; 
       
        for ( j = 1; j < userInput; j++) {
         
			System.out.println(j+3); //not printing numbers
			//Scan1.nextLine();
		Scan1.close();
        }
		
		
		
				
			
			
	}			
}