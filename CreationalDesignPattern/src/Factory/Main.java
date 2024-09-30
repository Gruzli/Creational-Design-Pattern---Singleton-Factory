package Factory;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Vehicle vehicle1 = vehicleFactory.vehicleFactory("truck");
		vehicle1.drive();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
