package Day6;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		boolean isVowel=false;
		System.out.println("Enter any character..");
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'B':
		case 'E':
		case 'I':
		case 'O':
		case 'U':isVowel=true;
		}
		
		if(isVowel==true)
		{
			System.out.println(ch+ " is a vowel");
		}
		else
		{
			System.out.println(ch+ " is a consonant");
		}

	}

}
