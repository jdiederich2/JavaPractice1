package jendiederich.Cars;

public class Main {

	public static void main(String[] args) {

		Car porche = new Car();
		
		porche.setModel("Carrera");
		System.out.println(porche.getModel());
		
		
		porche.setColor("red");
		porche.setDoors(2);
		porche.setEngine("Twin Turbo");
		porche.setWheels(4);
		
		porche.carFeatures();		
		
	}

}
