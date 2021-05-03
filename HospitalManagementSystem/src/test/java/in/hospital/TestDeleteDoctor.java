package in.hospital;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDeleteDoctor {
	/**
	 * add the doctor name and delete
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
