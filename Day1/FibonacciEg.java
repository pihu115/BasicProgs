package com;

import java.util.Scanner;

public class FibonacciEg {

	public static void main(String[] args) {
		int f1=0,f2=1,f3;
		System.out.println("enter number: ");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println(f1+" "+f2);
		for(int i=2;i<s;i++)
		{
			f3=f1+f2;
			System.out.println(" "+f3);
			f1=f2;
			f2=f3;
			
		}
			

	}

}
