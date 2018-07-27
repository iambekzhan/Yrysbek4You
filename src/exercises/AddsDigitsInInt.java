package exercises;

import java.util.Scanner; 

public class AddsDigitsInInt {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 0 and 1000:");
		
		int n = sc.nextInt();
		int sum = 0;
		int d = 0;
		
		while(n > 0) {
			d = n % 10;
			sum += d;
			n /= 10;
		}
		System.out.println(sum);
	}
}
