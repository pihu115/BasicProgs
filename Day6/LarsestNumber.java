package Day6;

import java.util.Scanner;

public class LarsestNumber {

	public static void main(String[] args) {
	
		System.out.println("Enter any three numbers..");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		
		if(x > y && x > z)
		{
			System.out.println(x+" is a largest number");
		}
		
		else if(y > x && y > z)
		{
		System.out.println(y+" is a largest number");	
	
		}
		
		else if(z >x && z>y)
		{
			System.out.println(z+ " is a largest number");	
		}
		else
		{System.out.println("Entered numbers are not distinct :"+x+","+y+","+z);}

	}

}
