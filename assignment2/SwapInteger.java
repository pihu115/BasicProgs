package assignment2;

import java.util.Scanner;

public class SwapInteger {
	public static void SwapInteger(int n1,int n2)
	{
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println(n1+ " "+n2);
	}
	public static void main(String[] args) {
		System.out.print("enter any two integer for swapping :");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		SwapInteger(n1,n2);
		
	}

}
