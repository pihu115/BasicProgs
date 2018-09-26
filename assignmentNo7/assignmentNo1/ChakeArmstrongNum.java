package assignmentNo1;

import java.util.Scanner;

public class ChakeArmstrongNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the num to check  Armstrong: ");
		 int Number = sc.nextInt();
		chkArmstrong(Number);
	}

	public static void chkArmstrong(int Number) {
		int Temp, Reminder, Times = 0;
		double Sum = 0;

		Temp = Number;
		while (Temp != 0) {
			Times = Times + 1;
			Temp = Temp / 10;
		}

		for (Temp = Number; Temp > 0; Temp = Temp / 10) {
			Reminder = Temp % 10;
			Sum = Sum + Math.pow(Reminder, Times);
		}
		

		if (Sum == Number) {
			System.out.println(Number+"  is NOT a Armstrong Number");
		} else {
			System.out.println(Number+"  is NOT a Armstrong Number");
		}
	}
}
