package SoldVehicles;

public enum MonthOfSale {
	JANUARY(0.3), MAY(0.4), AUGUST(0.5), OCTOBER(0.6), DECEMBER(0.7);

	public final double sctValue;

	MonthOfSale(double sctValue) {
		this.sctValue = sctValue;
	}
	
}
