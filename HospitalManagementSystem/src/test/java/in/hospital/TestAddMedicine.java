package in.hospital;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class TestAddMedicine {

	/**
	 * This method is used to check the test case for add medicine
	 */
	
	@Test
	public void testAddMedicine() {
		MedicineDetailData medicine1 = new MedicineDetailData();
		medicine1.medicineId = 1;
		medicine1.medicineName ="Paracetamal";
		medicine1.medicinePrice = 10;
		MedicineDetails.addMedicine(medicine1);
		
		MedicineDetailData medicine2 = new MedicineDetailData();
		medicine2.medicineId = 2;
		medicine2.medicineName ="Amoxicillin";
		medicine2.medicinePrice = 30;
		MedicineDetails.addMedicine(medicine2);
		
		MedicineDetailData medicine3 = new MedicineDetailData();
		medicine3.medicineId = 3;
		medicine3.medicineName ="Saridon";
		medicine3.medicinePrice = 5;
		MedicineDetails.addMedicine(medicine3);
		
		MedicineDetails.displayMedicine();
		
	}
}
	
	