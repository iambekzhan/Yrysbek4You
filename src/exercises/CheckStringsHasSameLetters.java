package exercises;

import java.util.Arrays;

public class CheckStringsHasSameLetters {
	
	public static void main(String[] args) {
		
		String a = "abc";
		String b = "cba";
		
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		
//		if(Arrays.equals(a1, b1)) {
//			System.out.println("anagram");
//		}else {
//			System.out.println("it's not anagram");
//		}
		
		String a2 = new String(a1);
		String b2 = new String(b1);
		
		if(a2.equals(b2)) {
			System.out.println("anagram");
		}else {
			System.out.println("it's not anagram");
		}
		
		
		
	}
}
