package SoldVehicles;

public enum SeatPost {
	CARBONFİBER(0.8), STEEL(0.7), ALUMİNUM(0.9), TİTANİUM(0.6);
	
	public final double sctValue;
	
	SeatPost(double sctValue){
		this.sctValue = sctValue;
	}
}
