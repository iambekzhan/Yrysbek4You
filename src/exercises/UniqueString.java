package exercises;

public class UniqueString {
	
	public static void main(String[] args) {
		
		String s = "abcdeb";
		String result = "";
		for(int i = 0; i < s.length(); i++) {
			String sub = s.substring(0, s.lastIndexOf(s.charAt(i)));
			if(!sub.contains(s.charAt(i) + "")) {
				result += s.charAt(i);
			}
		}
		
		System.out.println(result);
		
		
	}
}
