package week1.Assignment;

import java.util.Arrays;

public class FindSecondLargestNumber {
	public static void main(String[] args) {
		int[] data = {8,5,11,4,6,7,10,1};
		Arrays.sort(data);
		int Length = data.length;
	for (int i=0; i<Length; i++) {
		
	}
	System.out.println("The Second Largest Number is " + data[Length-2]);
	}

}
