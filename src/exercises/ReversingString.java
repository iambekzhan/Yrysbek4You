package exercises;

public class ReversingString {
	
	public static void reverse(String s) {
		// base case
		if(s == null || s.length() <= 1) {
			System.out.println(s);
			
		// recursive case
		}else {
			System.out.print
			(s.charAt(s.length() - 1));
			reverse(s.substring(0, s.length() - 1));
		}
	}
	
	public static void main(String[] args) {
		
		reverse("Java");
		
	}
}
