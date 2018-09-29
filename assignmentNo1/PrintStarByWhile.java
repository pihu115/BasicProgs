package assignmentNo1;

import java.util.Scanner;

public class PrintStarByWhile {
	public static void Accept(int n)
	
	{
		int i=0;
		while(i<n) {
			System.out.println(" * "); 
			i++;
		}
		
	}
	

	public static void main(String[] args) {
		System.out.println("Enter the number to print * :");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Accept(n);

	}

}
