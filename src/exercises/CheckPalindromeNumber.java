package exercises;

import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		int temp = num; 
		int reverse = 0;

		while (temp != 0) {
			reverse = reverse * 10;
			reverse = reverse + (temp % 10);
			temp = temp / 10;
		}
		
		if (num == reverse) {
			System.out.println(num + " is a palindrome number");
		}else {
			System.out.println(num + " is not a palidrome number");
		}
		
	}
}
