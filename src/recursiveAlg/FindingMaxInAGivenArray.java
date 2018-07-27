package recursiveAlg;

public class FindingMaxInAGivenArray {
	
	public static int findMax(int[] a, int l) {
		
		// 'l' is a length of our array
		
		// base case
		if(l == 1) {
			return a[0];
		}
		
		// recursive case
		
		return Math.max(a[l - 1], findMax(a, l - 1));
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2, 3, 4, 5, 13, 213, 32};
		
		System.out.println(findMax(arr, arr.length));
		
	}
}
