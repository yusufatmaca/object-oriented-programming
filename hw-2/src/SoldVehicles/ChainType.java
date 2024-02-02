package SoldVehicles;

public enum ChainType {
	DERAİLLEUR(1.1), ONECHAİN(1.2), DOUBLECHAİN(1.3);
	
	public final double sctValue;
	
	ChainType(double sctValue){
		this.sctValue = sctValue;
	}
}
