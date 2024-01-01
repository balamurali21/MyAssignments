package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		String s="mom";
		String rev="";
		//char[] charArray = s.toCharArray();
		for (int i =s.length()-1; i >=0 ; i--) {
			rev+=s.charAt(i);
			//System.out.println(rev);
		}
		System.out.println(s);
		if (s.equals(rev)) {
			System.out.println(s +" is a palindrome");

		}
		else {
			System.out.println(s + " is not a palindrome");
		}

	}

}
