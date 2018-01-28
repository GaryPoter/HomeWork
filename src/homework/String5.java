package homework;

import java.util.HashMap;
import java.util.Iterator;

import homework.utils.Strings;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = Strings.getSentence();
		System.out.println(s);
		HashMap<String, Integer> hm = new HashMap<>();
		String wordTmp;
		while(s.indexOf(' ') != -1){
			wordTmp = s.substring(0, s.indexOf(' '));
			if(hm.get(wordTmp) == null){
				hm.put(wordTmp, new Integer(1));
			}else{
				hm.put(wordTmp, hm.get(wordTmp) + 1);
			}
		}
		
		Iterator iter = hm.entrySet().iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
