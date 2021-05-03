package in.hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDeleteMedicine {
	
	/**
	 * This method is used to check the test case for delete medicine
	 */
	
	@Test
	public void testDeleteMedicine1() {
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
		
		
		MedicineDetails.displayMedicine();
		
		boolean isDeleted= MedicineDetails.deleteMedicine(1);
		assertTrue(isDeleted);
		System.out.println("List of Medicine:");
		MedicineDetails.displayMedicine();
	}

}
