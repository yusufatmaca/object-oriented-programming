package SoldVehicles;

public enum CabType {
	// Enum provides an easier way to handle and use the constant of the object and
	// their values. 

	REGULAR(2.5), EXTENDED(2.8), CREW(3.0);

	public final double sctValue;

	CabType(double sctValue) {
		this.sctValue = sctValue;
	}
}
