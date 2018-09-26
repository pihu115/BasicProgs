package assignmentNo1;

import java.util.Scanner;

public class PowerOfNum {
	public static long power(int base, int exp) {
		if (exp != 0) {
			return (base * power(base, exp - 1));
		} else {
			return 1;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int base = sc.nextInt();

		int exp = sc.nextInt();
		System.out.println("Output: " + power(base, exp));
	}

}
		
		



