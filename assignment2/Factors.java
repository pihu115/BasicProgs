package assignment2;

import java.util.Scanner;

public class Factors {
	
	public static void  DisplayComFactor(int n1,int n2)
	{
		int i=1;
		while((i <= n1) && (i <= n2)) {
			
			 if(n1 % i==0 && n2 % i==0)
			  System.out.print(i+" ");
			 i++;
		}
	}

	public static void main(String[] args) {
	
		System.out.print("Enter any two numbers :");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
System.out.print("factors of "+n1+" and "+n2+" are : ");
       DisplayComFactor(n1,n2);
            

	}

}
