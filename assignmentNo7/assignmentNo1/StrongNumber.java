package assignmentNo1;

import java.util.Scanner;

public class StrongNumber {

	static int f[] = new int[10]; 
	   
   
    static void preCompute() 
    { 
        f[0] = f[1] = 1; 
        for (int i = 2; i<10; ++i) 
            f[i] = f[i-1] * i; 
    } 
      
    
    static boolean chkStrong(int x) 
    { 
        int factSum = 0; 
       
         
        int temp = x; 
        while (temp>0) 
        { 
            factSum += f[temp%10]; 
            temp /= 10; 
        } 
       
        return (factSum == x); 
    
       } 
      
    // main function  
    public static void main (String[] args)  
    {  
    	 preCompute(); 
        System.out.println("enter any number: ");
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
       
        if(chkStrong(x)) 
        { 
            System.out.println("TRUE"); 
        } 
        else
            System.out.println("FALSE"); 
              
         
    } 
}
