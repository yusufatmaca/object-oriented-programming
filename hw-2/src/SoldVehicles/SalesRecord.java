package SoldVehicles;

import java.util.ArrayList;

import FileIO.FileIO;

public class SalesRecord {
	// The attributes which are arrays are created to hold all objects with their
	// own type, i.e, allHatchbacks array holds all Hatchback objects.
	private ArrayList<Hatchback> allHatchbacks = new ArrayList<Hatchback>();
	private ArrayList<Sedan> allSedans = new ArrayList<Sedan>();
	private ArrayList<Minivan> allMinivans = new ArrayList<Minivan>();
	private ArrayList<PickUpTruck> allPickUpTrucks = new ArrayList<PickUpTruck>();
	private ArrayList<Bicycle> allBicycles = new ArrayList<Bicycle>();

	FileIO readCSV = new FileIO("HW2_SoldVehicles.csv"); 
	// FileIO class reads the given CSV file and holds an array.

	public SalesRecord() {
		vehicleManager();
	}

	// The class holds objects and for avoiding privacy leaks, the deep copy should
	// be used in getter methods.
	public ArrayList<Hatchback> getHatchbackVehicles() {
		ArrayList<Hatchback> copyHatchbacks = new ArrayList<Hatchback>();
		// the new ArrayList is created. And thanks to copy constructor of all vehicle types, all objects are copied deeply. 
		for (int i = 0; i < allHatchbacks.size(); i++) {
			copyHatchbacks.add(new Hatchback(allHatchbacks.get(i)));
		}
		return copyHatchbacks;
	}

	public ArrayList<Sedan> getSedanVehicles() {
		ArrayList<Sedan> copySedans = new ArrayList<Sedan>();
		for (int i = 0; i < allSedans.size(); i++) {
			copySedans.add(new Sedan(allSedans.get(i)));
		}
		return copySedans;
	}

	public ArrayList<Minivan> getMinivanVehicles() {
		ArrayList<Minivan> copyMinivans = new ArrayList<Minivan>();
		for (int i = 0; i < allMinivans.size(); i++) {
			copyMinivans.add(new Minivan(allMinivans.get(i)));
		}
		return copyMinivans;

	}

	public ArrayList<PickUpTruck> getPickUpVehicles() {
		ArrayList<PickUpTruck> copyPickUpTrucks = new ArrayList<PickUpTruck>();

		for (int i = 0; i < allPickUpTrucks.size(); i++) {
			copyPickUpTrucks.add(new PickUpTruck(allPickUpTrucks.get(i)));
		}
		return copyPickUpTrucks;
	}

	public ArrayList<Bicycle> getBicycleVehicles() {
		ArrayList<Bicycle> copyBicycles = new ArrayList<Bicycle>();
		for (int i = 0; i < allBicycles.size(); i++) {
			copyBicycles.add(new Bicycle(allBicycles.get(i)));
		}
		return copyBicycles;
	}

	public void vehicleManager() {

		for (int i = 0; i < readCSV.allElements.size(); i++) {

			char firstLetter = readCSV.allElements.get(i)[0].charAt(0);
			// It splits and reads the first letter of the first index.
			switch (firstLetter) {
			case 'H':
				Hatchback hatchback = new Hatchback(readCSV.allElements.get(i)[0], readCSV.allElements.get(i)[1],
						readCSV.allElements.get(i)[2], Integer.parseInt(readCSV.allElements.get(i)[3]),
						readCSV.allElements.get(i)[4], Double.parseDouble(readCSV.allElements.get(i)[5]),
						Double.parseDouble(readCSV.allElements.get(i)[6]));
				allHatchbacks.add(hatchback);
				break;

			case 'S':
				Sedan sedan = new Sedan(readCSV.allElements.get(i)[0], readCSV.allElements.get(i)[1],
						readCSV.allElements.get(i)[2], Integer.parseInt(readCSV.allElements.get(i)[3]),
						readCSV.allElements.get(i)[4], Double.parseDouble(readCSV.allElements.get(i)[5]),
						Double.parseDouble(readCSV.allElements.get(i)[6]));
				allSedans.add(sedan);
				break;
			case 'M':
				Minivan minivan = new Minivan(readCSV.allElements.get(i)[0], readCSV.allElements.get(i)[1],
						readCSV.allElements.get(i)[2], Integer.parseInt(readCSV.allElements.get(i)[3]),
						Integer.parseInt(readCSV.allElements.get(i)[4]),
						Double.parseDouble(readCSV.allElements.get(i)[5]),
						Double.parseDouble(readCSV.allElements.get(i)[6]));
				allMinivans.add(minivan);
				break;
			case 'P':
				PickUpTruck pickUpTruck = new PickUpTruck(readCSV.allElements.get(i)[0], readCSV.allElements.get(i)[1],
						readCSV.allElements.get(i)[2], Integer.parseInt(readCSV.allElements.get(i)[3]),
						readCSV.allElements.get(i)[4], readCSV.allElements.get(i)[5],
						Double.parseDouble(readCSV.allElements.get(i)[6]));
				allPickUpTrucks.add(pickUpTruck);

				break;

			case 'B':
				Bicycle bicycle = new Bicycle(readCSV.allElements.get(i)[0], readCSV.allElements.get(i)[1],
						readCSV.allElements.get(i)[2], Integer.parseInt(readCSV.allElements.get(i)[3]),
						readCSV.allElements.get(i)[4], readCSV.allElements.get(i)[5],
						Double.parseDouble(readCSV.allElements.get(i)[6]));
				allBicycles.add(bicycle);
				break;
			default:
				System.out.println("You didn't enter a valid character!");
			}
		}
	}

	public void printAllSoldVehicles() {

		printAllHatchbacks();
		printAllSedans();
		printAllMinivans();
		printAllPickUpTrucks();
		printAllBicycles();

	}

	public void printAllHatchbacks() {

		for (Hatchback hatchback : allHatchbacks) {
			System.out.println("Vehicle: Hatchback Vehicle ID: " + hatchback.getVehicleID() + " Month: "
					+ hatchback.getMonthOfSale() + " City: " + hatchback.getCityOfSale() + " Production Year: "
					+ hatchback.getProductionYear() + " SCT: " + hatchback.calculateSpecialConsumptionTax());
			System.out.println("The total price paid for " + hatchback.getVehicleID() + " is: "
					+ hatchback.calculateTotalPrice() + " TL");
		}
	}

	public void printAllSedans() {

		for (Sedan sedan : allSedans) {
			System.out.println("Vehicle: Sedan Vehicle ID: " + sedan.getVehicleID() + " Month: "
					+ sedan.getMonthOfSale() + " City: " + sedan.getCityOfSale() + " Production Year: "
					+ sedan.getProductionYear() + " SCT: " + sedan.calculateSpecialConsumptionTax());
			System.out.println(
					"The total price paid for " + sedan.getVehicleID() + " is: " + sedan.calculateTotalPrice() + " TL");
		}

	}

	public void printAllMinivans() {

		for (Minivan minivan : allMinivans) {
			System.out.println("Vehicle: Minivan Vehicle ID: " + minivan.getVehicleID() + " Month: "
					+ minivan.getMonthOfSale() + " City: " + minivan.getCityOfSale() + " Production Year: "
					+ minivan.getProductionYear() + " SCT: " + minivan.calculateSpecialConsumptionTax());
			System.out.println("The total price paid for " + minivan.getVehicleID() + " is: "
					+ minivan.calculateTotalPrice() + " TL");
		}

	}

	public void printAllPickUpTrucks() {

		for (PickUpTruck pickUpTruck : allPickUpTrucks) {
			System.out.println("Vehicle: PickUpTruck Vehicle ID: " + pickUpTruck.getVehicleID() + " Month: "
					+ pickUpTruck.getMonthOfSale() + " City: " + pickUpTruck.getCityOfSale() + " Production Year: "
					+ pickUpTruck.getProductionYear() + " SCT: " + pickUpTruck.calculateSpecialConsumptionTax());
			System.out.println("The total price paid for " + pickUpTruck.getVehicleID() + " is: "
					+ pickUpTruck.calculateTotalPrice() + " TL");
		}

	}

	public void printAllBicycles() {

		for (Bicycle bicycle : allBicycles) {
			System.out.println("Vehicle: Bicycle Vehicle ID: " + bicycle.getVehicleID() + " Month: "
					+ bicycle.getMonthOfSale() + " City: " + bicycle.getCityOfSale() + " Production Year: "
					+ bicycle.getProductionYear() + " SCT: " + bicycle.calculateSpecialConsumptionTax());
			System.out.println("The total price paid for " + bicycle.getVehicleID() + " is: "
					+ bicycle.calculateTotalPrice() + " TL");
		}

	}

}
