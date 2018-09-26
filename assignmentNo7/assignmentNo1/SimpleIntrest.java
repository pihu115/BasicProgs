package assignmentNo1;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {

	

	

	double p, r, t, SI;
	System.out.print("Enter Principle amount : ");
	Scanner X = new Scanner(System.in);
	p=X.nextFloat();

	System.out.print("Enter Rate of Interest: ");
	r=X.nextFloat();

	System.out.print("Enter Time: ");
	t=X.nextFloat();


	double interest = calculateInterest(p, t, r);

	System.out.print("Total simple interest = "+interest+"\n");

	}

public static double calculateInterest(double principal, double time, double rate)
{
double result = (principal * time * rate )/ 100.0;
return result;
}}