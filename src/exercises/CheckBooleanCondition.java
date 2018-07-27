package exercises;

import java.util.Scanner;

public class CheckBooleanCondition {
	public static void main(String[] args) {
		
		char y;
		LOOP: for(int i = 0; i < 3; i++) {
			switch(i) {
			case '0':
				System.out.println("A");
			case 1:
				System.out.println("B");
			case 2:
				System.out.println("C");
			case 'a':
			}
		}
		
		boolean b1 = true;
		boolean b2 = false;
		
		if((b2 != b1) == b2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		
		int minimum;
		int maximum;
		
		minimum = (num1 < num2) ? num1 : num2;
		maximum = (num1 > num2) ? num1 : num2;
		
		System.out.println("The minimum of two numbers is : " + num1 + " and " + num2 + " is : " + minimum);
		System.out.println("The maximum of two numbers is : " + num1 + " and " + num2 + " is : " + maximum);
		
		int q = (10 > 20) ? 30 : 10 < 5 ? 50 : 40;
		
		int amount = 10;
		String result = amount <= 2 ? "couple" : amount > 2 && amount < 5 ? "few" : amount <= 5 ? "several" : "many";
		
		System.out.println(true & false);
		System.out.println(true && false);
	}
}
