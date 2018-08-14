package Day6;

import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) {
		System.out.println("enter  x and y");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y=sc.nextInt(); 
		
		System.out.println("Before swaping :"+x +","+y);
		
		int temp= x;
		x =y;
		y=temp;
		
		System.out.println("after swapping :"+x +","+y);
		
	}

}
