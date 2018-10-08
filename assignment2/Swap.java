package assignment2;

import java.util.Scanner;

public class Swap {
	public static void Temp(char ch1,char ch2)
	{
		char temp;
		temp=ch1;
		ch1=ch2;
		ch2=temp;
		 System.out.println(ch1+" "+ch2);
	}

	public static void main(String[] args) {
		System.err.print("enter any two character for swapping :");
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		char ch2=sc.next().charAt(0);
 Temp(ch1,ch2);


	}

}
