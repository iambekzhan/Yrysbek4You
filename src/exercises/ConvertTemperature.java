package exercises;

import java.util.Scanner;

public class ConvertTemperature {
	public static void main(String[] args) {
		
		double fahrenheit;
		double celcius;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit:");
		
		fahrenheit = sc.nextDouble();
		celcius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celcius + " in Celsius");
	}

}
