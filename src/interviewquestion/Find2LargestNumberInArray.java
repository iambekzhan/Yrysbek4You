package interviewquestion;

public class Find2LargestNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 23, 67, 23, 54, 45, 65 };
		System.out.println("The second largest number is: " + getSecondLargestNumber(arr));

	}

	public static int getSecondLargestNumber(int[] array) {
		int largest, secondLargest;
		largest = secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			//
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest && largest != array[i]) {
				secondLargest = array[i];
			}
		}

		return secondLargest;
	}
}
