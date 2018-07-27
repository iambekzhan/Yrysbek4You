package exercises;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {
	
	public static void main(String[] args) {
		
//		int[] arr = {1, 10};
//		List<Integer> a = new ArrayList<>();
//
//		int count = arr[0];
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			if(count != arr[i]) {
//				a.add(count);
//				i--;
//				count++;
//			}else {
//				count++;
//			}
//			
//			
//		}
//		System.out.println(a);
		
		
		
		int[] arr = {10,9,3,6,4,7,8,1,2};
		int length = arr.length;
		
		int indexes = 10;
		int values = 0;
		
		for (int i = 0; i < length; i++) {
			indexes += i+1;
			values += arr[i];
		}
		
		int result = indexes - values;
		
		System.out.println("Missing number is: "+result);
		
	}
}
