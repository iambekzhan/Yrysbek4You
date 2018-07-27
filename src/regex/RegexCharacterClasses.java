package regex;

import java.util.regex.Pattern;

public class RegexCharacterClasses {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[amn]", "amn"));
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]", "ammmna"));
		
		System.out.println(Pattern.matches("[^amn]", "r"));
		
	}
}
