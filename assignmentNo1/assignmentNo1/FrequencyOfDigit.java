package assignmentNo1;

import java.util.Scanner;

public class FrequencyOfDigit {
	
	
	public static void Frequency(int n)
	{
		 for(int i=0;i<=9;i++)
	        {
	          int  n2 = n;
	           int c=0;
	            while(n2!=0)
	            {
	               int d = n2%10;
	                n2 = n2/10;
	                if(d==i)
	                c++;
	            }
	            if(c!=0)
	            System.out.println(i+" -> "+c);
	        }
	}
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input: ");
       int n = sc.nextInt();
        System.out.println("Output: ");
        Frequency(n);
    }

}
