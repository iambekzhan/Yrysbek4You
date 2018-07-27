package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class MissedNumbers {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 6, 8, 17, 20};
		
		ArrayList<Integer> missed = new ArrayList<>();
		int j = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(j == arr[i]) {
				j++;
				continue;
			}else {
				missed.add(j);
				i--;
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(missed);
		
		
	}
}
