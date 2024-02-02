package SoldVehicles;

public class PickUpTruck extends SoldVehicles {
	private String cabType;
	private String truckBedType;
	protected final static int BASEPRICE = 250000;

	PickUpTruck(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, String cabType,
			String truckBedType, double valueAddedTax) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, valueAddedTax);
		setCabType(cabType);
		setTruckBedType(truckBedType);
	}

	PickUpTruck(PickUpTruck otherPickUpTruck) {
		super(otherPickUpTruck.getVehicleID(), otherPickUpTruck.getMonthOfSale(), otherPickUpTruck.getCityOfSale(),
				otherPickUpTruck.getProductionYear(), otherPickUpTruck.getValueAddedTax());
		setCabType(otherPickUpTruck.getCabType());
		setTruckBedType(otherPickUpTruck.getTruckBedType());

	}

	public String getCabType() {
		return cabType;
	}

	private void setCabType(String cabType) {
		this.cabType = cabType;
	}

	public String getTruckBedType() {
		return truckBedType;
	}

	private void setTruckBedType(String truckBedType) {
		this.truckBedType = truckBedType;
	}

	@Override
	public double calculateSpecialConsumptionTax() {
		double calculateSpecialConsumptionTax = (TruckBedType.valueOf(getTruckBedType().toUpperCase()).sctValue
				* ProductionYear.valueOf("_" + Integer.toString(super.getProductionYear())).sctValue)
				/ CabType.valueOf(getCabType().toUpperCase()).sctValue;
		return calculateSpecialConsumptionTax;

	}

	@Override
	public double calculateTotalPrice() {
		double totalPrice = BASEPRICE * (1 + (calculateSpecialConsumptionTax() * 0.6))
				+ (1 + (getValueAddedTax() / 100));
		return totalPrice;
	}

}
