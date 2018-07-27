package recursiveAlg;

import java.util.Scanner;

public class FibonacciNumbers {
	
	public static int nthFibNumber(int n) {
		//base case
		if(n <= 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		//recursive case
		}else {
			return nthFibNumber(n - 1) + nthFibNumber(n - 2);
		}
		
	}
	
	public static void main(String[] args) {
	
		System.out.println(nthFibNumber(3));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
