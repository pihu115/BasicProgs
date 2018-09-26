package assignmentNo1;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {

		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Output: ");

		for (int i = 0; i <=n+1; i++) {

			System.out.print(n + " ");
			for (int j = 0; j < n; j++)
				System.out.print("# ");
			n--;
		}
	}

}
