package exercises;

import java.util.Arrays;

public class SortingArrays {
	public static void main(String[] args) {
		
		int[] n = {11, 4, 6, 23, 6};
		int b = 11;
		Arrays.sort(n);
		Arrays.binarySearch(n, b);
		for (int i : n) {
			if(i == 11) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
