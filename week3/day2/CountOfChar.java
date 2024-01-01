package week3.day2;

public class CountOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "TestLeaf";
		int count = 0;
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {

		if (charArray[i]=='e') {
			count++;
		System.out.println(count);	
			
		}
		
		}
		
	}

}
