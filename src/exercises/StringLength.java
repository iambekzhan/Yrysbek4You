package exercises;

public class StringLength {
	
	public static void main(String[] args) {
		
		String str = "java";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char[] c = str.toCharArray();
			count++;
		}
		System.out.println(count);
	}
}
