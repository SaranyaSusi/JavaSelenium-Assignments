package week1.Assignment;

public class SumOfDigits {
	public static void main(String[] args) {
		int abc= 99;
		int sum=0;
		while(abc>0)
		{
			int remainder=abc%10;
			sum = sum+remainder;
			abc = abc/10;         		
		}
		System.out.println("The Sum of digits is "+sum);
	}
}