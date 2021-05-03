package in.hospital;

import org.junit.Test;

public class TestAddPatient {

	// Adding the patient details
	
	@Test
	public void testAddPatient1() {
		PatientDetailData patient1 = new PatientDetailData();
		patient1.patientId = 1;
		patient1.patientName ="kannan";
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
		System.out.println("List of Patients:");
		PatientDetails.displayPatient();

	}
	
}
