package week1.Assignment;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int a = 153;
		int b = 0;
		int c = 0;
		int d = a;
		
		while(a>0)
		{
			c= a%10;
	a = a/10;
	b = b+c*c*c;
		}
		if (d==b) {
			System.out.println("Its an Armstrong Number");
		}
		else
			System.out.println("Its not an Armstrong Number");
	}
}
