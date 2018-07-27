package regex;

import java.util.regex.Pattern;

public class RegexMetacharactersExample {
	
	public static void main(String[] args) {
		
		System.out.println("metacharacters d...."); 		//\\d means digit  
		  
		System.out.println(Pattern.matches("\\d", "abc"));  
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "4443")); 
		System.out.println(Pattern.matches("\\d", "323abc"));
		  
		System.out.println("metacharacters D...."); 		//\\D means non-digit  
		  
		System.out.println(Pattern.matches("\\D", "abc"));
		System.out.println(Pattern.matches("\\D", "1"));  
		System.out.println(Pattern.matches("\\D", "4443")); 
		System.out.println(Pattern.matches("\\D", "323abc"));
		System.out.println(Pattern.matches("\\D", "m"));
		  
		System.out.println("metacharacters D with quantifier....");  
		System.out.println(Pattern.matches("\\D*", "mak"));
		
		
		
		
	}
}
