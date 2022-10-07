package week1.Assignment;

public class PrintDuplicateNumberInArrays {
	public static void main(String[] args) {
		int[] arr = {19,25,14,10,15,19,18,17,15};
		int Length = arr.length;
		int count;
		for(count = 0; count < Length-1; count++)
		for(int i = count+1; i < Length; i++)
			if(arr[count]==arr[i]) {
			System.out.println("The Duplicate Array is " + arr[count]);
			}
	}
}
