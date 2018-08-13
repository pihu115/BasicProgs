package Day5;

import java.util.Scanner;

public class TempratureConversion {
	public static void main(String[] args) {
		System.out.println("Enter temerature in Fahrentheit");
		Scanner sc=new Scanner(System.in);
		float Temperature= sc.nextInt();
		
		
		 Temperature=( ((Temperature-32)*5)/9);
		
		System.out.println("temperature in celsius :" +Temperature);
				

	}

}
