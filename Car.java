package week3.day1;

public class Car extends Vehicle{
	public void opensunroof()
	{
		System.out.println("open sunroof");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car carobj = new Car();
carobj.applyBreak();
carobj.soundhorn();
carobj.opensunroof();

	}

}
