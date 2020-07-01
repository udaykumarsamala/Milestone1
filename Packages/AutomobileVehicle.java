package Packages;

abstract class Vehicle {
	public abstract void getModelName();
	public abstract void getRegistrationNumber();
	public abstract void getOwnerName();
}

class Hero extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	

	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
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

	public int getSpeed() {
		return speed;
	}
	
	public void radio() {
		System.out.println("Accessing the radio");
	}
	
}

class Honda extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	

	public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
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
	
	public int getSpeed() {
		return speed;
	}
	
	public void cdplayer() {
		System.out.println("Accessing CD Player.");
	}

}

public class AutomobileVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("Glamour 125", "WB16G1234", "Bob Biswas", 85);
		hero.getModelName();
		hero.getOwnerName();
		hero.getRegistrationNumber();
		hero.getSpeed();
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda City", "WB18G7777", "Prodosh Mitra", 110);
		honda.getModelName();
		honda.getOwnerName();
		honda.getRegistrationNumber();
		honda.getSpeed();
		honda.cdplayer();

	}

}
