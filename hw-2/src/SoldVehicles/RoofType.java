package SoldVehicles;

public enum RoofType {
	REGULAR(0.5), MOONROOF(0.6), SUNROOF(0.8);

	public final double sctValue;

	RoofType(double sctValue) {
		this.sctValue = sctValue;
	}
}
