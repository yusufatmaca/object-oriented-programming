package SoldVehicles;

public class SoldVehicles {
	private String vehicleID;
	private String monthOfSale;
	private String cityOfSale;
	private int productionYear;
	private double valueAddedTax;

	public SoldVehicles(String vehicleID, String monthOfSale, String cityOfSale, int productionYear,
			double valueAddedTax) {
		setVehicleID(vehicleID);
		setMonthOfSale(monthOfSale);
		setCityOfSale(cityOfSale);
		setProductionYear(productionYear);
		setValueAddedTax(valueAddedTax);

	}

	public String getVehicleID() {
		return vehicleID;
	}

	private void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getMonthOfSale() {
		return monthOfSale;
	}

	private void setMonthOfSale(String monthOfSale) {
		this.monthOfSale = monthOfSale;
	}

	public String getCityOfSale() {
		return cityOfSale;
	}

	private void setCityOfSale(String cityOfSale) {
		this.cityOfSale = cityOfSale;
	}

	public int getProductionYear() {
		return productionYear;
	}

	private void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public double getValueAddedTax() {
		return valueAddedTax;
	}

	private void setValueAddedTax(double valueAddedTax) {
		this.valueAddedTax = valueAddedTax;
	}

	// These two methods below are overridden in the subclasses. If an object but an
	// undefined type is returned 0. Otherwise, the calculation will be made.
	public double calculateSpecialConsumptionTax() {
		return 0;
	}

	public double calculateTotalPrice() {
		return 0;
	}

}
