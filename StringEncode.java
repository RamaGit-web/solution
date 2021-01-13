package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StringEncode {

	public static void main(String[] args) {
		System.out.println(stringEncode("aaabbcbbaaa")); 
		System.out.println(stringEncode("cccccccccc")); 
		System.out.println(stringEncode(""));
	}
	
	public static List<HashMap<Character,Integer>> stringEncode(String s) {
		
		List<HashMap<Character,Integer>> encodedMap = new ArrayList<HashMap<Character, Integer>>();
		int len = s.length();
		if (len == 0) return encodedMap;
		int count;
		
		for (int i = 0; i < len; i++) { 
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			char c = s.charAt(i);
			count = 0;
			int j = i;
			while(j < len) {
				if (s.charAt(j) == c ) {
					count++;
				}else {	
					break;
				}
				map.put(c, count);
				j++;
			}
			i = j-1;
			encodedMap.add(map);
			
		}
		return encodedMap;
		
	}

}
