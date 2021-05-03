package in.hospital;
import java.util.ArrayList;
import java.util.List;

public class HospitalLogin {
	
	// Used to store array list of user name and password
	
	static List<String> username = new ArrayList<String>();
	static List<String> password = new ArrayList<String>();
	
	/**
	 * This method is used to register login details
	 * 
	 * @param user
	 * @param pass
	 * @return
	 */

	public static boolean loginRegister(String user,String pass) {
		
		username.add(user);
		password.add(pass);
		return true;
		
	}
	
	/**
	 * This method is used to check login
	 * 
	 * @param user
	 * @param pass
	 * @return
	 */
	
	public static boolean checkLogin(String user,String pass) {
		for(int i=0 ;i<username.size() ;i++)
		if (user.equals(username.get(i)) && pass.equals(password.get(i))) {
			return true;
		}
		return false;
	}



















}
