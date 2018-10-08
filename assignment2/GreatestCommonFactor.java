package assignment2;

import java.util.Scanner;

public class GreatestCommonFactor {
	
	public static void GCF(int n1,int n2)
	{
		int gcf = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
          
            if(n1 % i==0 && n2 % i==0)
                gcf = i;
          
        }
        System.out.print("G.C.F. of "+n1+" and "+ n2+" is :"+gcf);
	}

	public static void main(String[] args) {
	
		System.out.println("Enter any two numbers :");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		GCF(n1,n2);
        
		
		
		

	}

}
