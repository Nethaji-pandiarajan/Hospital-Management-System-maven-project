package in.hospital;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUpdateDoctor {
	/**
	 *This method is used to check the test case of updation of doctor
	 * 
	 */
	
	@Test
	public void updateDoctor1() {
		String dname = "Raghuraman";
		String newname = "Gopalakrishnan";
		DoctorDetails.addDoctor(dname);   //add doctor name
		DoctorDetails.displayDoctor();						//display doctorList	
		boolean isUpdated = DoctorDetails.updateDoctor(dname, newname);  	//update doctor name
		DoctorDetails.displayDoctor();						//display doctor name
		assertTrue(isUpdated);
	}

}
