/* @author 270201084 Yusuf ATMACA
 * @author 270201085 Selim TIKIZ
 * @author 280201052 Murat KÜÇÜK
 * @author 280201072 Kübra HOLT
 * 
 * App class provides only to display the result of required details of the vehicles.
 */

package SoldVehiclesApp;

import java.util.Scanner;

import SoldVehicles.SalesRecord;

public class App {

	public static void main(String[] args) {
		theMenu();

	}

	static void theMenu() {
		SalesRecord salesRecord = new SalesRecord(); // salesRecord object is only created in App class, others are
														// created like chain.
		Scanner scan = new Scanner(System.in);

		boolean validity = true;
		while (validity) {
			System.out.println("*******************************************************************");
			System.out.print(
					"Please press,\n1 to see all sold vehicles list\n2 to see sold sedan list\n3 to see sold hatchback list\n4 to see sold minivan list\n5 to see sold pickup truck list\n6 to see sold bicycle list\nPlease enter your choice: ");

			int choose = scan.nextInt();

			switch (choose) {

			case 1:
				salesRecord.printAllSoldVehicles();
				System.out.println("*******************************************************************");
				validity = false;
				break;

			case 2:
				salesRecord.printAllSedans();
				System.out.println("*******************************************************************");
				validity = false;
				break;

			case 3:
				salesRecord.printAllHatchbacks();
				System.out.println("*******************************************************************");
				validity = false;
				break;

			case 4:
				salesRecord.printAllMinivans();
				System.out.println("*******************************************************************");
				validity = false;
				break;

			case 5:
				salesRecord.printAllPickUpTrucks();
				System.out.println("*******************************************************************");
				validity = false;
				break;

			case 6:
				salesRecord.printAllBicycles();
				System.out.println("*******************************************************************");
				validity = false;
				break;

			default:
				System.out.println("Entered value is invalid! Please enter an integer number between 1 and 6.");
				validity = true; // if the user entered invalid numbers, the user should enter a valid number,
									// therefore the user should be sent back to the beginning of the loop.

			}
		}
	}
}