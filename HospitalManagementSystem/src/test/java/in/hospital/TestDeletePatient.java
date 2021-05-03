package in.hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDeletePatient {

	@Test
	public void testDeletePatient1() {
		
		PatientDetailData patient1 = new PatientDetailData();
		patient1.patientId = 1;
		patient1.patientName ="vibin";
		patient1.patientAge = 21;
		patient1.patientGender ="Male";
		patient1.reason = "fever";
		PatientDetails.addPatient(patient1);
		
		PatientDetailData patient2 = new PatientDetailData();
		patient2.patientId =2;
		patient2.patientName ="ravi";
		patient2.patientAge = 65;
		patient2.patientGender ="male";
		patient2.reason = "fever";
		PatientDetails.addPatient(patient2);
		
		PatientDetails.displayPatient();
		
		boolean isDeleted= PatientDetails.deletePatient(2);
		assertTrue(isDeleted);
		System.out.println("After Deleting the Patient details:");
		PatientDetails.displayPatient();
	}
	
	

}
