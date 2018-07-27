package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAdvancedExample {
	
	public static void main(String[] args) {
		
		String longString = " Today team Master Mind will do presentation at 1500 "
				+ "about Cucumber, Chicago3, Batch8 IL IA LA chicago123@gmail.com"
				+ "312-312-3222";
		String strangeString = " 1Z aaa **** *** {{ {{{ {  ### $$ @@ 24 ";
		
		// Word that is 2 to 20 character in length
		// [A-Za-z]{2,20}  
//		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		
		// \\d - digits		\\D - non-digits		{4} - length
//		regexChecker("\\s\\d{4}\\s", longString);
		
		// 2 character that start with a I or L
		// I[DLNA]|L[A]
//		regexChecker("I[DLNA]|L[A]", longString);
		
		// {5,} -> min 5 character
		// + -> whatever proceeds must occur one or more times
		// . ^ * + ? {} [] \ | () -> you have to have backlash before them
		// . -> looking for anything
//		regexChecker("\\{{1,}", strangeString);
//		regexChecker("\\{+", strangeString);
//		regexChecker(".{3}", strangeString);
		
		// chicago123@gmail.com
		// [A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}
//		regexChecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}", longString);
		
		
		// 1-(312)312-3222   (312)312-3222   312-312-3222    312 312-3222
//		regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[A-Za-z0-9]{7})", longString);
		
		regexReplace(longString);
		
	}
	
	public static void regexChecker(String theRegex, String str2Check) {
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while(regexMatcher.find()) {
			if(regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());
			}
			
			System.out.println("Start index: " + regexMatcher.start());
			System.out.println("End index: " + regexMatcher.end());
		}
	}
	
	
	public static void regexReplace(String str2Replace) {
		
		Pattern replace = Pattern.compile("\\s+");
		
		Matcher regexMatcher = replace.matcher(str2Replace.trim());
		
		System.out.println(regexMatcher.replaceAll(", "));
	}
	
	
	
	
}
