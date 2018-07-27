package exercises;

import java.util.ArrayList;

public class UniqueNumbers {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,1,2,3,4,5,7,8,9};
		
//		int flag = 0;
//        System.out.print("Unique numbers are: ");
//        for(int i = 0; i < a.length; i++) {
//            for(int j = 0; j < a.length; j++) {
//                if(i != j) {
//                    if(a[i] != a[j]) {
//                        flag = 1;
//                    }else {
//                        flag = 0;
//                        break;
//                    }
//                }
//            }
//            if(flag == 1) {
//                System.out.print(a[i]+" ");
//            }
//        }
		ArrayList<Integer> a1 = new ArrayList<>();
		
		outer: for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i] == a[j] && i != j) {
					continue outer;
				}
			}
			a1.add(a[i]);
		}
		System.out.println(a1);
	}
}
