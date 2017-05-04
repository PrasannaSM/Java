interface DriveCar {}
class Vehicle {}
class Car extends Vehicle implements DriveCar {}
class MotorCycle extends Vehicle {}
public class InstanceofExample 
{
	public static void main(String[] args) 
	{
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		MotorCycle moto = new MotorCycle();
		System.out.println("1.vehicle instanceof Vehicle: "+(vehicle instanceof Vehicle));
		System.out.println("2.car instanceof Vehicle: "+(car instanceof Vehicle));
		System.out.println("3.car instanceof Car: " +(car instanceof Car));
		System.out.println("4.car instanceof DriveCar: "+(car instanceof DriveCar));
		System.out.println("5.moto instanceof Vehicle: "+(moto instanceof Vehicle));
		System.out.println("6.moto instanceof MotorCycle: "+(moto instanceof MotorCycle));
		System.out.println("7.vehicle instanceof Car: "+(vehicle instanceof Car));
		System.out.println("8.vehicle instanceof DriveCar: "+(vehicle instanceof DriveCar));
		System.out.println("9.moto instanceof DriveCar: "+(moto instanceof DriveCar));

		// those will evaluate to false, as the object car is null
		car = null;
		System.out.println("10.(car=null) instanceof Vehicle: "+(car instanceof Vehicle));
		System.out.println("11.(car=null) instanceof Car: "+(car instanceof Car));
	}

}

