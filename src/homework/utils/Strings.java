package homework.utils;

import java.util.Scanner;

public class Strings {

	public static String getString() {
		// TODO Auto-generated method stub
		/*������*/
		Scanner c = new Scanner(System.in);
		//����
		StringBuffer sb = new StringBuffer();
		//���
		sb.append(c.next());
		
		return sb.toString();

	}
	
	
	public static boolean isPalindrome(String s) {
		return s.equals(new StringBuffer(s).reverse().toString());
	}
	
	public static String getSentence() {
		/*������*/
		Scanner c = new Scanner(System.in);
		//����
		StringBuffer sb = new StringBuffer();
		//���
//		while (c.hasNext()) {
//			String s = (String) c.next();
//			sb.append(s + "/");
//		}
		for (int i = 0; i > -1; i++) {
//			System.out.println(c.hasNext());
//			c.next();
//			System.out.println(c.next());
			String s = c.next();
			sb.append(s + "/");
		}
		return sb.toString();
	}
}
