package interviewquestion;

import java.util.Arrays;

public class SimilarStringsFrom2Arrays {
	
	public static void main(String[] args) {
		
		String[] array1 = {"ab", "cd", "ef"};
		String[] array2 = {"bb", "cc", "ef"};
		String[] array3 = getSimilarWords(array1, array2);
		System.out.println(Arrays.toString(array3));
		
	}
	
	public static String[] getSimilarWords(String[] array1, String[] array2) {
		String[] array3 = new String[array1.length];
		int index = 0;
		
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) {
				if(array1[i].equals(array2[j])) {
					array3[index] = array1[i];
					index++;
					break;
				}
			}
		}
		return array3;
	}
}
