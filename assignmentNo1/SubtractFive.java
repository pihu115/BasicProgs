package assignmentNo1;

import java.util.Scanner;

public class SubtractFive {
  public static int Subtract(int n)
  {
	  int ans=0;
	  ans=n-5;
	  return ans;

  }
	
	
	public static void main(String[] args) {
		
System.out.print("Enter any number to subtract by 5 :");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

Subtract(n);
	}

}
