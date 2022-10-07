package week1.Assignment;

public class TwoWheeler {
	public int noOfWheels(int num1, int num2)
	{
	int count = num1 + num2;
	return count;
	}
	
	public short noOfMirrors(int num3)
	{
	short mirror = 2;
	return mirror;
	}
		
	public long chassisNumber()
	{
	long number = 425681812L;
	return number;
	}
	
	public boolean isPunctured()
	{
		boolean type = false;
		return type;
	}
	public String bikeName()
		{
		String name="RoyalEnfeild";
		return name;
}
		
	public double runningKM() {
		double runKM = 3215484.652485;
		return runKM;
	}
		
	public static void main(String args[])
	{
		TwoWheeler car = new TwoWheeler();
		int count = car.noOfWheels(1, 1);
		System.out.println(count);
		short mirror = car.noOfMirrors(2);
		System.out.println(mirror);
		long number = car.chassisNumber();
		System.out.println(number);
		boolean type = car.isPunctured();
		System.out.println(type);
		String name = car.bikeName();
		System.out.println(name);
		double runKM= car.runningKM();
		System.out.println(runKM);	
		
	}
		

}
