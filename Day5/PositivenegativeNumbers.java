package Day5;

import java.util.Scanner;

public class PositivenegativeNumbers {

	public static void main(String[] args) {
     
		System.out.println("Enter any number..");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n>0)
		{
			System.out.println("Positive Number");
		}
		else
			System.out.println("Negative Number");
		

	}

}
