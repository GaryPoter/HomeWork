package homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import homework.utils.Strings;

public class String3 {
	public static char[] vowel = new char[]{'a', 'e', 'i', 'o', 'u'}; 
	
	public static boolean isAVowel(char c) {
		for (int i = 0; i < vowel.length; i++) {
			if(c == vowel[i]){
				return true;
			}
		}
		return false;
	}
	
	public static HashMap<Character, Integer> readData(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!isAVowel(c)){
				continue;
			}
			if(hm.get(new Character(c)) != null){
				hm.put(new Character(c), hm.get(new Character(c)) + 1);
			}else {
				hm.put(new Character(c), new Integer(1));
			}
		}
		return hm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Character, Integer> hm = new HashMap<>();
		String s = Strings.getString();
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if(!isAVowel(c)){
//				continue;
//			}
//			if(hm.get(new Character(c)) != null){
//				hm.put(new Character(c), hm.get(new Character(c)) + 1);
//			}else {
//				hm.put(new Character(c), new Integer(1));
//			}
//		}
		HashMap<Character, Integer> hm = readData(s);
		Iterator iter = hm.entrySet().iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}

	}

}
