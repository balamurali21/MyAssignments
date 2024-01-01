package week1.day2_javabasics;

public class PrimeNumbers {

	public static void main(String[] args) {
		 int num=9;
		 if ((num%2==1)&&(num%num==0)) {
			 
			 System.out.println("The given " + num + " is prime");
			
		}
		 else {
			 
			 System.out.println("The given " + num + " is not a prime");
		}

	}

}
