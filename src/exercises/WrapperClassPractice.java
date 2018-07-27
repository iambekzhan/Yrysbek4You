package exercises;

public class WrapperClassPractice {
	public static void main(String[] args) {
		
		byte b = (byte) 129;
		Byte input = new Byte(b);
		Byte input1 = new Byte((byte) 127);
		Byte input2 = new Byte(b + "");
		System.out.println(input + input1 + input2);
	}
}
