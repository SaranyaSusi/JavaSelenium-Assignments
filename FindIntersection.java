package week1.Assignment;

public class FindIntersection {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr1 = {9,8,7,6,5};
		for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr1.length; j++) {
		if(arr[i]==arr1[j]) {
	     System.out.println("The intersection number is "+arr1[i]);
		}
		}
		}
	}
}
