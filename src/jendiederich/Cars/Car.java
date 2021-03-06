package jendiederich.Cars;

public class Car {

	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("carrera") || validModel.equals("commodore")) {
			this.model = model;
		} else {
			this.model = "Unknown";
		}
	}
	
	public String getModel() {
		return this.model;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void carFeatures() {
		System.out.println(this.model + ", " + this.color + ", " + this.doors + ", " + this.wheels + ", " + this.engine);
	}
}
