package week1.Assignment;

public class PrimeNumber {
	public static void main(String[] args) {
		int input = 13;
		int j;
		boolean flag = false;
		for (int i = 2; i<input;i++ )
		{
			j= input%i;
			if(j==0) {
				flag = true;
				break;
					}
		}		
		if(flag==false) {
			System.out.println("Its a Prime Number");					
		}else
			System.out.println("Its not a prime Number");				
			
			}

}
