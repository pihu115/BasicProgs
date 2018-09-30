package assignmentNo1;

import java.util.Scanner;

public class DisplayHello {
	public static void Dhello(int n)
	{
		if(n<10)
		{
			System.out.println("HELLO");
		}
		else {
			System.out.println("DEMO");
		}
	}

	public static void main(String[] args) {
		
		
		System.out.print( "Enter any number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Dhello(n);
		
		
		
		
		
		
		
		

	}

}
