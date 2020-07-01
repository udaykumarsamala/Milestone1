package Packages;

abstract class Vehicles {
	public abstract void getModelName();
	public abstract void getRegistrationNumber();
	public abstract void getOwnerName();
}

class Logan extends Vehicles {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int gps;
	
	

	public Logan(String modelName, String registrationNumber, String ownerName, int speed, int gps) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.gps = gps;
	}

	@Override
	public void getModelName() {
		System.out.println("modelName: " + modelName);
	}

	@Override
	public void getRegistrationNumber() {
		System.out.println("registrationNumber: " + registrationNumber);
	}

	@Override
	public void getOwnerName() {
		System.out.println("ownerName: " + ownerName);
	}
	
	public int speed() {
		return speed;
	}
	
	public int gps() {
		return gps;
	}

}
class Ford extends Vehicle {

	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int tempControl;

	public Ford(String modelName, String registrationNumber, String ownerName, int speed, int tempControl) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.tempControl = tempControl;
	}

	
	public void getModelName() {
		System.out.println("modelName: " + modelName);
	}

	
	public void getRegistrationNumber() {
		System.out.println("registrationNumber: " + registrationNumber);
	}

	
	public void getOwnerName() {
		System.out.println("ownerName: " + ownerName);
	}
	
	public int speed() {
		return speed;
	}
	
	public int tempControl() {
		return tempControl;
	}

}

public class Speed_gps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logan logan = new Logan("Logan XYZ", "WB16F2222", "Bob Biswas", 220, 1);
		logan.getModelName();
		logan.getOwnerName();
		logan.getRegistrationNumber();
		logan.speed();
		System.out.println("Has GPS? " + logan.gps());
		
		System.out.println();
		
		Ford ford = new Ford("Mustang GT", "WB16F4444", "Alice", 300, 1);
		ford.getModelName();
		ford.getOwnerName();
		ford.getRegistrationNumber();
		ford.speed();
		System.out.println("Has AC? " + ford.tempControl());

	}

}
