package SoldVehicles;

public enum TruckBedType {
	REGULAR(0.5), TANKER(0.8), TRAİLER(1.0);
	
	public final double sctValue;
	
	TruckBedType(double sctValue){
		this.sctValue = sctValue;
	}
}
