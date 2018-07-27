package exercises;

public class StarTriangle {

	public static void main(String[] args) {

//		String s = "*";
//
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(s);
//			s = s + " *";
//		}
		
//	        System.out.print("     J        A       V     V       A       \n");
//	        System.out.print("     J       A A       V   V       A A      \n");
//	        System.out.print(" J   J      AAAAA       V V       AAAAA     \n");
//	        System.out.print("  J J      A     A       V       A     A    \n");
		
		String s ="*";
		
		for(int i = 1; i <= 10; i++) {
			for( int j = 1; j <= 10 - i; j++) {
				System.out.print(" ");
			}
			System.out.println(s);
			s += "*";
		}

	}
}
