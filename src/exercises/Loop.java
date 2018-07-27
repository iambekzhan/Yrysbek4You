package exercises;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		
		System.out.println("put the number:");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i <= 10; i++) {
			result = N*i;
			System.out.println(N + " x " + i + " = " + result);
		}
	}
}
