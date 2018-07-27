package exercises;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your word");
		String JJ = input.nextLine();
		StringBuilder JJJ = new StringBuilder(JJ);
		String a = JJJ.reverse().toString();
		if(JJ.equals(a)) {
			System.out.println("is a palindrome");
		}else {
			System.out.println("is not");
		}
		

		
	}
}
