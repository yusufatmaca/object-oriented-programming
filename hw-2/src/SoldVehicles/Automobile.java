package SoldVehicles;

public class Automobile extends SoldVehicles {
	private double engineVolume;
	protected static final int BASEPRICE = 200000;

	Automobile(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, double engineVolume,
			double valueAddedTax) {

		super(vehicleID, monthOfSale, cityOfSale, productionYear, valueAddedTax);
		setEngineVolume(engineVolume);

	}

	public double getEngineVolume() {
		return engineVolume;
	}

	private void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	@Override
	public double calculateSpecialConsumptionTax() {
		return 0;
	}

	@Override
	public double calculateTotalPrice() {
		double totalPrice = (BASEPRICE * (1 + calculateSpecialConsumptionTax() * 0.8))
				+ (1 + (getValueAddedTax() / 100));
		return totalPrice;
	}
}
