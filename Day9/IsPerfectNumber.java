package Day9;

import java.util.Scanner;

public class IsPerfectNumber {

	public Boolean isPerfectNumber(int n)
	{
		
		int temp=0;
		for(int i=1;i<=n/2;i++) 
		{
			if(n%i==0)
			temp=temp+i;
							
			}
	
			if(temp==n)
			{
				System.out.println(n+" is a perfect number.");
				return true;
			}else
			{
			System.out.println(n+ " is not a perfect number.");
			return false;
			}
	}
	
	
	public static void main(String[] args) 
	{
		IsPerfectNumber ipn= new IsPerfectNumber();
		System.out.println(" is perfect number: "+ipn.isPerfectNumber(28) );
		

	}

	}
