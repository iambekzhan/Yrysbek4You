package exercises;

public class MixString {
	
	public static void main(String[] args) {
		
		String a = "abc";
		String b = "xyznnn";
		
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		
		op: for(int i = 0; i < a1.length; i++) {
			for(int j = 0; j < b1.length; j++) {
				if(i == j) {
					System.out.print("" + a1[i] + b1[j]);
					continue op;
				}
			}
		}
	}
}
