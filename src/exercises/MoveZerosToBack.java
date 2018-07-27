package exercises;

import java.util.Arrays;

public class MoveZerosToBack {
	
	public static void main(String[] args) {
		
//		int[] a = {2, 3, 5, 2, 1, 0, 0, 0, 3, 5, 23, 6, 0, 0, 2};
//		String b = "";
//		String c = "";
//		
//		for(int i = 0; i < a.length; i++) {
//			if(a[i] > 0) {
//				b = b + a[i] + ",";
//			}else {
//				c = c + a[i] + ",";
//			}
//		}
//		
//		System.out.println(b + c);
		
		
//		int[] a = {1,0,0,2,3,45,0,0,0,6,7,8,0,23,42,11,0,0,0,7,8,90};
//		
//		ArrayList<Integer> al = new ArrayList<>();
//		ArrayList<Integer> al1 = new ArrayList<>();
//		
//		for(int i=0; i<a.length; i++) {
//			if(a[i]>0) {
//				al.add(a[i]);
//			}else
//				al1.add(a[i]);
//		}
//		
//		al.addAll(al1);
//		
//		System.out.println(al.toString());
		
		
		
		int[] a = { 1, 29, 0, 0, 68, 53, 31, 7, 0, 0, 0, 78, 56, 0, 98, 55, 7 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j] == 0) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		
	}
}
