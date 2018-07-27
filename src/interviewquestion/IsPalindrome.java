package interviewquestion;

public class IsPalindrome {

	public static void main(String[] args) {

		String word = "anana";
		System.out.println("Is this '" + word + "' palindrome? " + isPalindrome(word));

	}

	public static boolean isPalindrome(String word) {
		for (int i = 0; i < word.length() / 2; i++) {
			String start = word.charAt(i) + "";
			String end = word.charAt(word.length() - 1 - i) + "";
			if (!start.equals(end)) {
				return false;
			}
		}

		return true;
	}
}
