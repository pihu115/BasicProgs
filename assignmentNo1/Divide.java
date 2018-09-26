package assignmentNo1;

import java.util.Scanner;




public class Divide {
	
	public static int divide(int n1,int n2)
	{
		if(n1<n2)
		{return -1;}
		int answer=0;
		answer=n1/n2;
		return answer;
	}

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int answer=divide(n1,n2);
		System.out.println("Answer is: "+answer);
		  

	}

}
