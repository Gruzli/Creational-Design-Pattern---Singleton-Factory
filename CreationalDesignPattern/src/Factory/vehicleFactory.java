package Factory;

public class vehicleFactory {

	public static Vehicle vehicleFactory(String type) {
		// TODO Auto-generated method stub
		if(type.toLowerCase() == "car") {
			return new Car();
		}else if(type.toLowerCase() == "bike") {
			return new Bike();
		}else if(type.toLowerCase() == "truck") {
			return new Truck();
		}else {
			throw new IllegalArgumentException("Unknown");
		}
	}

}
