package SoldVehicles;

public enum ProductionYear {
	_2001(1.0), _2002(1.0),_2003(1.0), _2004(1.0), _2005(1.0), _2006(1.0), _2007(1.0),_2008(1.0), 
	_2012(1.2), _2013(1.2), _2014(1.2), _2015(1.2), _2016(1.2), _2017(1.2), 
	_2018(1.6), _2019(1.6), _2020(1.6), _2021 (1.6), _2022(1.6);
	
	public final double sctValue;
	
	ProductionYear(double sctValue){
		this.sctValue = sctValue;
	}
	
}
