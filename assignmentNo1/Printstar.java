package assignmentNo1;

import java.util.Scanner;

public class Printstar {
	public static void Accept(int n)
	{
		for(int i=0;i<n;i++) {
			System.out.print(" * ");
		}
	}

	public static void main(String[] args) {
		
System.out.println("Enter the number to print * :");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Accept(n);
	}

}
