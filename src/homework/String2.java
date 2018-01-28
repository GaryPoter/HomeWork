package homework;

import homework.utils.Strings;

public class String2 {

//	public static char[] vowel = new char[]{'a', 'e', 'i', 'o', 'u'}; 
	public static StringBuffer last = new StringBuffer("-?ay");
	public static String vowel = "aeiou";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = Strings.getString();
		int i = getIndex(word);
		String result = getResult(word, i);
		System.out.println(result);
		
//		System.out.println(s1 + s2 + last.toString());

	}
	private static String getResult(String word, int i) {
		// TODO Auto-generated method stub
		//元音前的字符串s1与元音后的s2
		String s1 = word.substring(0, i);
		String s2 = word.substring(i + 1);
		
		//整合数据
		StringBuffer sb = new StringBuffer();
		sb.append(s1);
		sb.append(s2);
		last.replace(1, 2, word.substring(i, i + 1));
		sb.append(last);
		return sb.toString();
	}
	private static int getIndex(String word) {
		// TODO Auto-generated method stub
		int j = 0;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			j = vowel.indexOf(c);
			if(j == -1){
				j = i;
				break;
			}
		}
		return j;
	}

}
