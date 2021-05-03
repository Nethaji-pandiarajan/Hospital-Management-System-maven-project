package in.hospital;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class TestSearchMedicine {
	
	/**
	 * This method is used to check the testcase for search medicine
	 */
	
	@Test
	public void testSearchMedicine1() {
		
		MedicineDetailData medicine1 = new MedicineDetailData();
		medicine1.medicineId = 1;
		medicine1.medicineName ="Paracetamal";
		medicine1.medicinePrice = 10;
		medicine1.medicineExpiry = LocalDate.parse("2023-10-20");
		MedicineDetails.addMedicine(medicine1);
		
		MedicineDetailData medicine2 = new MedicineDetailData();
		medicine2.medicineId = 2;
		medicine2.medicineName ="Amoxicillin";
		medicine2.medicinePrice = 30;
		medicine1.medicineExpiry = LocalDate.parse("2020-10-20");
		MedicineDetails.addMedicine(medicine2);
		
		MedicineDetailData medicine3 = new MedicineDetailData();
		medicine3.medicineId = 3;
		medicine3.medicineName ="Saridon";
		medicine3.medicinePrice = 5;
		medicine1.medicineExpiry = LocalDate.parse("2023-06-10");
		MedicineDetails.addMedicine(medicine3);
	
		System.out.println("Search Result:");
		assertTrue(MedicineDetails.searchMedicine(1));

	}
	
	@Test
	public void testSearchPatient2() {
		
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
		System.out.println("Search Result:");
		assertTrue(MedicineDetails.searchMedicine(2));

	}
}
