package recursiveAlg;

public class SumOfN {
	
	public static int sum(int i) {
		int n = i;
		// base case
		if(n == 0) {
			return 0;
		//recursive case
		}else {
			return n + sum(n - 1);
		}
	}
	
	public static int factorial(int i) {
		
		// base case
		if(i == 0) {
			return 1;
		}else if(i == 1) {
			return 1;
		//recursive case
		}else {
			return i * factorial(i - 1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum(10));
		System.out.println(factorial(5));
	}
}
