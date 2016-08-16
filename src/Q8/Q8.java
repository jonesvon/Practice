package Q8;

import java.util.ArrayList;

public class Q8 {

	public static void main(String[] args) {
		//while loop that sums all #'s in an arraylist
		
		ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            
            int i=0;
            long sum =0;
            
            while (i<numbers.size()){
            
            	sum+= numbers.get(i);
            	
            	i++;
				
			}		
            
         
        	  
            System.out.println(numbers);			
		}
				
			
	}


