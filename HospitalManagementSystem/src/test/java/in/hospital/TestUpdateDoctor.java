package in.hospital;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUpdateDoctor {
	/**
	 *
	 * 
	 * 
	 */
	
	@Test
	public void updateDoctor1() {
		String dname = "Raghuraman";
		String newname = "Gopalakrishnan";
		boolean isStored = DoctorDetails.addDoctor(dname);   //add doctor name
		DoctorDetails.displayDoctor();						//display doctorList	
		boolean isUpdated = DoctorDetails.updateDoctor(dname, newname);  	//update doctor name
		DoctorDetails.displayDoctor();						//display doctor name
		assertTrue(isUpdated);
	}

}
