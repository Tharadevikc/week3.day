package week3.day1;

public class Auto extends Vehicle {
	public static void main(String[] args) {
	Auto auto = new Auto();
	auto.applyBreak();
	auto.soundhorn();
	
	Car car =new Car();
	car.applyBreak();
	
	Vehicle vehicle = new Vehicle();
	vehicle.applyBreak();
	vehicle.soundhorn();
	
}
}