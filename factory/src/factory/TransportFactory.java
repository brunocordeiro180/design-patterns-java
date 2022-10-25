package factory;

public class TransportFactory {
	public static Transport createTransport(TransportType transportType) {
		return transportType.getTransport();
	}
}
