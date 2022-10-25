package factory;

public class Truck implements Transport{

	@Override
	public void deliver() {
		System.out.println("Delivering a Truck");
	}

}
