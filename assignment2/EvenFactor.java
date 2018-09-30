package assignment2;

import java.util.Scanner;

public class EvenFactor {
	public static void EvenNum(int n)
	{
		 for(int i = 1; i <= n; ++i) {
	            if (n % i == 0) {
	                System.out.print(i + " ");
	            }
	        }
	}

	public static void main(String[] args) {

		 System.err.print("Enter your number :");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();

	        System.out.print("Factors of " + n + " are: ");
	       EvenNum(n);
	}

}
