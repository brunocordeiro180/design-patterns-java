package factory;

public class Main {

	public static void main(String[] args) {
		var transport1 = TransportFactory.createTransport(TransportType.Ship);
		var transport2 = TransportFactory.createTransport(TransportType.Truck);
		
		transport1.deliver();
		transport2.deliver();
	}
}
