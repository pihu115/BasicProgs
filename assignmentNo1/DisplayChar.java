package assignmentNo1;

import java.util.Scanner;

public class DisplayChar {
	public static void Display(char c)
	{
		System.out.println("you have entered the character :"+c);
	}
	

	public static void main(String[] args)
	{
		System.out.print("Entyer any character to desplay :");
		Scanner sc= new Scanner(System.in);
		char c=sc.next().charAt(0);
		Display(c);
		

	}

}
