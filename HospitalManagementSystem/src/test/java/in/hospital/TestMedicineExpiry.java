package in.hospital;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TestMedicineExpiry {

	/**
	 * This method is used to check the testcase for medicine expiry
	 */
	
	@Test
	public void testMedicineExpiry1() {
		MedicineDetailData medicine1 = new MedicineDetailData();
		int id = 1;
		medicine1.medicineId = id;
		medicine1.medicineName ="Paracetamal";
		medicine1.medicinePrice = 10;
		medicine1.medicineExpiry = LocalDate.parse("2023-10-20");
		MedicineDetails.addMedicine(medicine1);
		
		MedicineDetailData medicine2 = new MedicineDetailData();
		medicine2.medicineId = 2;
		medicine2.medicineName ="Amoxicillin";
		medicine2.medicinePrice = 30;
		medicine2.medicineExpiry = LocalDate.parse("2020-10-20");
		
		MedicineDetails.addMedicine(medicine2);
		
//		LocalDate today = LocalDate.now();	
//		LocalDate expiryDate = medicine2.medicineExpiry;
		System.out.println( medicine2.medicineName  + " medicine is Expired");
//		assertTrue(today.isAfter(expiryDate));
		assertTrue(MedicineDetails.isMedicineExpired(id));
		
	}
	
	@Test
	public void testMedicineExpiry2() {
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
		medicine2.medicineExpiry = LocalDate.parse("2020-10-20");
		
		MedicineDetails.addMedicine(medicine2);   // Add medicine list into the array
		
		System.out.println(medicine1.medicineName + " is Not Expired");
		
		assertTrue(MedicineDetails.isMedicineExpired(2));
	}

}
