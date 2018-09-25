package assignmentNo1;

import java.util.Scanner;

public class GenericRoot {
	
		
		public static void main(String[] args) 
		{
			int Number;
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" Please Enter any Integer Value : ");
			Number = sc.nextInt();	
			
			GenericRoot(Number);
		}
		
		public static void GenericRoot(int Number)
		{
			int Sum, Reminder;
			
			while(Number >= 10)
			{
				for (Sum=0; Number > 0; Number= Number/10)
			    {
					Reminder = Number % 10;
					Sum=Sum + Reminder;  
			    }
			    if(Sum >= 10)
			    {
			    	Number = Sum;
			    }
			    else
			    {
			    	System.out.println("\n The Generic Root of a Given Number = " + Sum);
			    }
			}
		}
}
