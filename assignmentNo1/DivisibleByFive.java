package assignmentNo1;

import java.util.Scanner;

public class DivisibleByFive {
	
	public static void divisible(int n)
	{
		
		if((n%5)==0)
		{
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
		
	} 

	public static void main(String[] args) {
		System.out.println("please enter any number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
divisible(n);


	}

}
