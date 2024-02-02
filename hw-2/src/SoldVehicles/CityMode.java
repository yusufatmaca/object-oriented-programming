package SoldVehicles;

public enum CityMode {
	YES(0.15), NO(0.1);
	
	public final double sctValue;
	
	CityMode(double sctValue){
		this.sctValue = sctValue;
	}
}
