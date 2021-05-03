package in.hospital;

import java.time.LocalDate;
import java.util.ArrayList;

public class MedicineDetails {

	//Creating medicineInfo list by using ArrayList
	
	static ArrayList<MedicineDetailData> medicineInfo = new ArrayList<MedicineDetailData>();
	

	/**
	 * This method is used to add medicine
	 * 
	 * @param medicine
	 */
	
	public static void addMedicine(MedicineDetailData medicine) {
		medicineInfo.add(medicine);
	}
	
	/**
	 * This method is used to delete medicine
	 * 
	 * @param deletemedicineId
	 * @return
	 */
	
	public static boolean deleteMedicine(int deleteMedicineId) {
		boolean isDeleted = false;
		int index = 0;
		for ( MedicineDetailData medicine : medicineInfo) {
			if(medicine.medicineId == deleteMedicineId) {			
				isDeleted = true;
				break;
			}
			index++;
		}
		if(isDeleted) {
			medicineInfo.remove(index);
		}
		return isDeleted;
	}
	
	/**
	 * This method is used to search medicine details
	 * 
	 * @param searchmedicineid
	 * @return
	 */
	
	public static boolean searchMedicine(int searchMedicineid) {
		boolean isSearched = false;
		for (MedicineDetailData medicine : medicineInfo) {
			if(medicine.medicineId == searchMedicineid) {
				System.out.println(medicine.medicineId + " " + medicine.medicineName + " " + medicine.medicinePrice + " ");
				isSearched =true;
				break;
			}
		}
		return isSearched;
	}
	
	/**
	 * This method is used to display medicine
	 * 
	 */

	public static void displayMedicine() {

		for (MedicineDetailData medicine : medicineInfo) {
			System.out.println(medicine.medicineId + " " + medicine.medicineName + " " + medicine.medicinePrice);

		}
	}
	
	/**
	 * This method is used to check the medicine is expired or not
	 * 
	 * @return 
	 */
	
	public static boolean isMedicineExpired(int medicineId) {
		boolean isExpired = false;
		for (MedicineDetailData medicine : medicineInfo) {
			if(medicine.medicineId == medicineId) {
					LocalDate today = LocalDate.now();	
					LocalDate expiryDate = medicine.medicineExpiry;
					isExpired = today.isBefore(expiryDate);
			}
			}
		return isExpired;
	}
	

}
