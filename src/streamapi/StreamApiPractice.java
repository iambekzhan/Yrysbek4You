package streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApiPractice {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Brad", "Pitt", "John", "Adam", "Jack", "Sam");
		
//		for(String name : names) {
//			if(!name.equals("Sam")) {
//				System.out.println(name);
//			}
//		}
		
//		names.stream()
//			.filter(new Predicate<String>() {
//				public boolean test(String name) {
//					return !name.equals("Sam");
//				}
//			})
//			.forEach(name -> System.out.println(name));
		
		names.stream()
			.filter(StreamApiPractice :: isNotSam)
			.forEach(System.out :: println);
		
		
	}

	private static boolean isNotSam(String name) {
		return !name.equals("Sam");
	}
}
