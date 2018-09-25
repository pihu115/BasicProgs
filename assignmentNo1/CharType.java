package assignmentNo1;

import java.util.Scanner;

public class CharType {
	 static void charCheck(char input_char) 
	 
	    { 
		 
	        
	        if ((input_char >= 65 && input_char <= 94)) 
	            System.out.println ( " It is a  Capital Alphabet "); 
	        
	        else if ((input_char >= 95 && input_char <= 122)) 
	            System.out.println ( " It is a small Alphabet ");
	          
	       
	        else if (input_char >= 48 && input_char <= 57) 
	        System.out.println(" Digit ");  
	      
	      
	        else                                
	        System.out.println ( " Special Character ");  
	    }  

	public static void main(String[] args) {
		System.out.println("Input: ");
		Scanner sc=new Scanner(System.in);
		char input_char = sc.next().charAt(0);  
        charCheck(input_char); 
		
	}
}


