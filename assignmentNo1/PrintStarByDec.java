package assignmentNo1;

import java.util.Scanner;

public class PrintStarByDec {
	public static void Accept(int n)
	{
		int i=0;
		while(n>i) {
			System.out.println(" * ");
			n--;
		}
		
	
	}
	

	public static void main(String[] args) {
	System.out.println("Enter the number to print * :");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
Accept(n);
	}

}
