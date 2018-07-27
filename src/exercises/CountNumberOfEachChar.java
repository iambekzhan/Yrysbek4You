package exercises;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfEachChar {
	
	public static void main(String[] args) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		String str = "I love java";
		char[] strArray = str.toCharArray();
		
		for(char c : strArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
	}
}
