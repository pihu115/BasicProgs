package Day4;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		System.out.println("Enter your value");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next(".").charAt(0);
		
        char ascii = ch;
        
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + castAscii);


	}

}
