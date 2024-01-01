package week1.day2_javabasics;

import java.util.Arrays;

public class LearningArrays {

	public static void main(String[] args) {
		int [] value = {98,87,93,91,90};
		
	// To find the length of the array
		
		int len = value.length;
		System.out.println("Length of index is " + len);
		System.out.println("Below are datas sorted in ascending order");
		
	// Sorting arrays in Ascending order
		
		Arrays.sort(value);
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
	// Find the last index of the array
		
		
		System.out.println("The last index of the arrray is " + value[len-1]);
	}

}

