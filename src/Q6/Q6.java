package Q6;

public class Q6 {

	public static void main(String[] args) {
		// write a for loop that finds all the indices of "a"
		//in the String. "This Java bootcamp is awesome" 
		int tracker=0;
		int i = 0;
		
		
		String message = "This bootcamp is Awesome.";
		
		 
		for ( i = 0; i < message.length(); i++) {
			   
			  if(message.toLowerCase().charAt(i) == 'a')
			  	  
				  tracker++;
			  
			  		
		}
		
		
		System.out.println(tracker); 	
					
				}
					
				

	}


