package SoldVehicles;

public class Bicycle extends SoldVehicles {
	private String chainType;
	private String seatPost;
	protected final static int BASEPRICE = 10000;

	Bicycle(String vehicleID, String monthOfSale, String cityOfSale, int productionYear, String chainType,
			String seatPost, double valueAddedTax) {
		super(vehicleID, monthOfSale, cityOfSale, productionYear, valueAddedTax);
		setChainType(chainType);
		setSeatPost(seatPost);
	}
	
	Bicycle(Bicycle otherBicycle) {
		super(otherBicycle.getVehicleID(), otherBicycle.getMonthOfSale(), otherBicycle.getCityOfSale(),
				otherBicycle.getProductionYear(), otherBicycle.getValueAddedTax());
		setChainType(otherBicycle.getChainType());
		setSeatPost(otherBicycle.getSeatPost());

	}
	
	

	public String getChainType() {
		return chainType;
	}

	private void setChainType(String chainType) {
		this.chainType = chainType;
	}

	public String getSeatPost() {
		return seatPost;
	}

	private void setSeatPost(String seatPost) {
		this.seatPost = seatPost;
	}

	@Override
	public double calculateSpecialConsumptionTax() {
		double calculateSpecialConsumptionTax = (0.1 * ChainType.valueOf(getChainType().toUpperCase()).sctValue
				* SeatPost.valueOf(getSeatPost().toUpperCase()).sctValue)
				+ MonthOfSale.valueOf(super.getMonthOfSale().toUpperCase()).sctValue;

		return calculateSpecialConsumptionTax;
	}
	
	@Override
	public double calculateTotalPrice() {
		double totalPrice = (BASEPRICE * 0.9) * (1 + calculateSpecialConsumptionTax()) + (1 + (super.getValueAddedTax()/100));
	return totalPrice;
	}
	
}
