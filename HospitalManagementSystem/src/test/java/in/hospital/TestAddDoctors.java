package in.hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddDoctors {

	@Test
	public void TestAddDoctor1() {
		String dname = "Venkatesan";
		boolean isValid = DoctorDetails.addDoctor(dname);
		assertTrue(isValid);
		DoctorDetails.displayDoctor();
	}
	
	@Test
	public void TestAddDoctor2() {
		String dname="Ramakrishnan";
		boolean isValid = DoctorDetails.addDoctor(dname);
		assertTrue(isValid);
		DoctorDetails.displayDoctor();		
	}
}
