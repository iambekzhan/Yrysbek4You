package exercises;

public class NumberFromString {
	public static void main(String[] args) {
		
	
	String str = "abcd213sads324dsg";
	String num = "";
		
		for(int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if(Character.isDigit(c)) {
				num = num + c;
			}
			
		}
		System.out.println(num);
	}
}
