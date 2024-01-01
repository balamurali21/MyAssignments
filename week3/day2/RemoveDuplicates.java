package week3.day2;

public class RemoveDuplicates {

	/*
	 * Pseudo code 

	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 

	 * g) Displaying the String without duplicate words	
	 */

	public static void main(String[] args) {

		        String string1 = "We learn java basics as part of java sessions in java week1";  
		        int count;  
		          
		        //Converts the string into lowercase  
		        string1 = string1.toLowerCase();  
		          
		        //Split the string into words using built-in function  
		        String[] words = string1.split(string1, ' ');  
		          
		        
		        for(int i = 0; i < words.length; i++) {  
		            count = 1;  
		            for(int j = i+1; j < words.length; j++) {  
		                if(words[i].equals(words[j])) {  
		                    count++;  
		                    //Set words[j] to 0 to avoid printing visited word  
		                    words[j] = "0";  
		                }  
		            }  
		              
		            //Displays the duplicate word if count is greater than 1  
		            if(count > 1 && words[i] != "0")  
		               System.out.println(words[i]);;  
		        }  
		    }  
		}  

