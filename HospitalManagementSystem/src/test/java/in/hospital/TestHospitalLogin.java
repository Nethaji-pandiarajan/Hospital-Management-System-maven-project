package in.hospital;

import static org.junit.Assert.*;

import org.junit.Test;

import in.hospital.HospitalLogin;

public class TestHospitalLogin {

	/**
	 * This method is used to check the test case for register user and login
	 */
	
	@Test
	public void test1() {
		String user = "Nethaji";
		String pass ="1234";
		HospitalLogin.loginRegister(user, pass);   
		boolean isValid = HospitalLogin.checkLogin(user,pass);
		assertTrue(isValid);
		
	}
	
	
	//True test case
	@Test
	public void test2() {
		String user = "Gokul";
		String pass ="1234";
		HospitalLogin.loginRegister(user, pass);
		boolean isValid = HospitalLogin.checkLogin(user,pass);
		assertTrue(isValid);
		
	}
	
	// True Test case
	
	@Test
	public void test3() {
		String user = "Vibin";
		String pass ="134";
		HospitalLogin.loginRegister(user, pass);
		boolean isValid = HospitalLogin.checkLogin(user,pass);
		assertTrue(isValid);
		
	}
	
	// True Test case
	
	@Test
	public void test4() {
		String user = "Pk";
		String pass ="Ram";
		HospitalLogin.loginRegister(user, pass);
		boolean isValid = HospitalLogin.checkLogin(user,pass);
		assertTrue(isValid);
		
	}
	
}