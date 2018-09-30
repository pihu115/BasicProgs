package assignment2;

import java.util.Scanner;

public class print {
	
public static void main(String[] args)
{
	System.out.print("Enter any number :");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();

	System.out.print("Printing "+n + " number of even numbers :" );

	for(int i=1; i <= n; i++){
	
		
		if( i % 2 == 0){
			System.out.print(i + " ");
		}
		
	}
	
	}
}
