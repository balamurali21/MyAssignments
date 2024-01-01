package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
        if (i%2==0) {
        	System.out.print(test.substring(i, i+1).toUpperCase());
			
		}
        else {
        	System.out.print(test.substring(i, i+1).toLowerCase());
        }

		}
	}

}











