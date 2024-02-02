package SoldVehicles;

public class Hatchback extends Automobile {
	private String cityMode;

	Hatchback(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, String cityMode,
			double engineVolume, double valueAddedTax) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, engineVolume, valueAddedTax);

		setCityMode(cityMode);

	}

	Hatchback(Hatchback otherHatchback){
		super(otherHatchback.getVehicleID(), otherHatchback.getMonthOfSale(), otherHatchback.getCityOfSale(), otherHatchback.getProductionYear(), 
				otherHatchback.getEngineVolume(), otherHatchback.getValueAddedTax());
		setCityMode(otherHatchback.getCityMode());
		
		
	}

	public String getCityMode() {
		return cityMode;
	}

	private void setCityMode(String cityMode) {
		this.cityMode = cityMode;
	}

	@Override
	public double calculateSpecialConsumptionTax() {
		double calculateSpecialConsumptionTax = (super.getEngineVolume() * 0.3
				* ProductionYear.valueOf("_" + Integer.toString(getProductionYear())).sctValue)
				+ CityMode.valueOf(getCityMode().toUpperCase()).sctValue;
		return calculateSpecialConsumptionTax;

	}

}
