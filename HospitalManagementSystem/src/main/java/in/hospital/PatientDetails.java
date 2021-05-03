package in.hospital;

import java.util.ArrayList;

public class PatientDetails {

	//Creating patientInfo list by using arraylist
	
	static ArrayList<PatientDetailData> patientInfo = new ArrayList<PatientDetailData>();

	/**
	 * This method is used to add patient
	 * 
	 * @param patient
	 */
	
	public static void addPatient(PatientDetailData patient) {
		patientInfo.add(patient);
	}
	
	/**
	 * This method is used to delete patient
	 * 
	 * @param deletePatientId
	 * @return
	 */
	
	public static boolean deletePatient(int deletePatientId) {
		boolean isDeleted = false;
		int index = 0;
		for ( PatientDetailData patient : patientInfo) {
			if(patient.patientId == deletePatientId) { 
				isDeleted = true;
				break;
			}
			index++;
		}
		if(isDeleted) {
			patientInfo.remove(index);
		}
		
		return isDeleted;
	}
	
	/**
	 * This method is used to search patient details
	 * 
	 * @param searchPatientid
	 * @return
	 */
	
	public static boolean searchPatient(int searchPatientid) {
		boolean isSearched = false;
		for (PatientDetailData patient : patientInfo) {
			if(patient.patientId == searchPatientid) {
				System.out.println(patient.patientId + " " + patient.patientName + " " + patient.patientAge + " " + patient.patientGender + " "
						+ patient.reason);
				isSearched =true;
				break;
			}
		}
		return isSearched;
	}
	
	/**
	 * This method is used to display patient
	 * 
	 */

	public static void displayPatient() {

		for (PatientDetailData patient : patientInfo) {
			System.out.println(patient.patientId + " " + patient.patientName + " " + patient.patientAge + " " + patient.patientGender + " "
					+ patient.reason);

		}
	}
}
