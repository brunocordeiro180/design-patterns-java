package factory;

public enum TransportType {
	Ship{
		public Transport getTransport() {
			return new Ship();
		}
	},
	Truck{
		public Transport getTransport() {
			return new Truck();
		}
	};

	public abstract Transport getTransport();
}
