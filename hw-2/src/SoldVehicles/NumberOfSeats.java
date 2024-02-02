package SoldVehicles;

public enum NumberOfSeats {
	_4(0.1), _5(0.4), _6(0.6), _7(0.8);
	
	public final double sctValue;
	
	NumberOfSeats(double sctValue){
		this.sctValue = sctValue;
	}
}
