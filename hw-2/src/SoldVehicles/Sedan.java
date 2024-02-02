package SoldVehicles;

public class Sedan extends Automobile {
	private String roofType;

	Sedan(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, String roofType,
			double engineVolume, double valueAddedTax) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, engineVolume, valueAddedTax);

		setRoofType(roofType);
	}
	
	
	Sedan(Sedan otherSedan){
		super(otherSedan.getVehicleID(), otherSedan.getMonthOfSale(), otherSedan.getCityOfSale(), otherSedan.getProductionYear(), 
				otherSedan.getEngineVolume(), otherSedan.getValueAddedTax());
		setRoofType(otherSedan.getRoofType());
		
		
	}

	public String getRoofType() {
		return roofType;
	}

	private void setRoofType(String roofType) {

		this.roofType = roofType;
	}

	@Override
	public double calculateSpecialConsumptionTax() {
		double calculateSpecialConsumptionTax = (super.getEngineVolume() * 0.2
				* RoofType.valueOf(getRoofType().toUpperCase()).sctValue)
				/ ProductionYear.valueOf("_" + Integer.toString(getProductionYear())).sctValue;
		return calculateSpecialConsumptionTax;
	}
}
