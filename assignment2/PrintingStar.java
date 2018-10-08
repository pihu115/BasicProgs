package assignment2;

import java.util.Scanner;

public class PrintingStar {
	
	public static void Accept(int n)
	{
		while(n>0)
		{
			System.out.print("* ");
			n--;}
	}

	public static void main(String[] args) {
System.out.print("Enter any number to print * :");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

Accept(n);
	}

}
