package classAndObject;

public class VarArgs {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		int[] nums = {2, 3, 77};
		c.printAllArrayNumbers(nums);
		c.printAllNumbers(1, 3, 5, 2, 8, 345, 1, 342);
		c.printAllStrings("Hello World!");
	}
}
