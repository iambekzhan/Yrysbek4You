package interviewquestion;

public class reverseNumber {
	
	public static void main(String[] args) {
		
		int number = 1005001;
		System.out.println(reverseNumber(number));
		
	}
	
	public static int reverseNumber(int number) {
		int reversedNumber = 0;
		int lastNumber;
		
		while(number != 0) {
			lastNumber = number % 10;
			reversedNumber = reversedNumber * 10 + lastNumber;
			number = number / 10;
		}
		
		return reversedNumber;
	}
}
