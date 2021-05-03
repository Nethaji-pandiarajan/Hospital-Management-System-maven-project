package in.hospital;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDeleteDoctor {
	/**
	 * This method is used to check the test case for delete the doctor name
	 */	
	
	@Test
	public void testDeleteDoctor1(){
		String dname = "Venkatesan";
	    DoctorDetails.addDoctor(dname);
		String dname1 = "RajaKumar";
		DoctorDetails.addDoctor(dname1);
		DoctorDetails.displayDoctor();
		boolean  isDeleted = DoctorDetails.deleteDoctor("Venkatesan");
		DoctorDetails.displayDoctor();
		assertTrue(isDeleted);
	}

}
