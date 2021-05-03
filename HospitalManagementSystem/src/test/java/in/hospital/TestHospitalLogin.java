package in.hospital;

import static org.junit.Assert.*;

import org.junit.Test;

import in.hospital.HospitalLogin;

public class TestHospitalLogin {

	// True Test case
	
	@Test
	public void test1() {
		String user = "Nethaji";
		String pass ="1234";
		boolean isRegValid = HospitalLogin.loginRegister(user, pass);
		//user1
		boolean isValid = HospitalLogin.checkLogin(user,pass);
		assertTrue(isValid);
		
	}
	
	// False Test case
	
	@Test
	public void test2() {
		String user = "Rahul"; 
		String pass ="123"; 
		boolean isRegValid = HospitalLogin.loginRegister(user, pass);
		boolean isValid = HospitalLogin.checkLogin(user,pass);
		assertFalse(isValid);
	}
	
	// False Test case
	
	@Test
	public void test3() {
		String user = "Rahul"; 
		String pass ="123"; 
		boolean isRegValid = HospitalLogin.loginRegister(user, pass);
		boolean isValid = HospitalLogin.checkLogin(user,"1245");
		assertTrue(isValid);
	}
	
	//True test case
	@Test
	public void test4() {
		String user = "Gokul";
		String pass ="1234";
		boolean isRegValid = HospitalLogin.loginRegister(user, pass);
		//user1
		boolean isValid = HospitalLogin.checkLogin(user,pass);
		assertTrue(isValid);
		
	}
	
	// False Test case
	
	@Test
	public void test5() {
		String user = "Madan"; 
		String pass ="12367"; 
		boolean isRegValid = HospitalLogin.loginRegister(user, pass);
		boolean isValid = HospitalLogin.checkLogin("1234",pass);
		assertFalse(isValid);
	}
	
	// True Test case
	
	@Test
	public void test6() {
		String user = "Vibin";
		String pass ="134";
		boolean isRegValid = HospitalLogin.loginRegister(user, pass);
		//user1
		boolean isValid = HospitalLogin.checkLogin(user,pass);
		assertTrue(isValid);
		
	}
	
	// True Test case
	
	@Test
	public void test7() {
		String user = "Pk";
		String pass ="Ram";
		boolean isRegValid = HospitalLogin.loginRegister(user, pass);
		//user1
		boolean isValid = HospitalLogin.checkLogin(user,pass);
		assertTrue(isValid);
		
	}
	
	// False Test case
	
	@Test
	public void test8() {
		String user = "Rahulkl"; 
		String pass ="1000"; 
		boolean isRegValid = HospitalLogin.loginRegister(user, pass);
		boolean isValid = HospitalLogin.checkLogin("Magath","9876");
		assertTrue(isValid);
	}
}

