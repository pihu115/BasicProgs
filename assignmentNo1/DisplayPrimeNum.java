package assignmentNo1;

import java.util.Scanner;

public class DisplayPrimeNum {

	public static void main(String[] args) {

		System.out.println("Enter  any two Inputs: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = sc.nextInt();
		

	int count;

		  for (int i = num; i <= n; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) 
		   {
		    if (i % j == 0)
		    {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }

		  }
		 }
	}


