package in.hospital;

import java.util.ArrayList;


public class DoctorDetails {
	
	// Array List to store the doctor name
	
	static ArrayList<String> doctorname = new ArrayList<String>();

	
	/**
	 * This method is used to add doctor in arrayList
	 * 
	 * @param dname
	 * @return
	 */
	
	public static boolean addDoctor(String dname) {	
		doctorname.add(dname);		
		return true;
	}
	
	/**
	 * This method is used to delete the doctor in arrayList
	 * @param dname
	 * @return
	 */
	
	public static boolean deleteDoctor(String dname) {
		int index = doctorname.indexOf(dname);
		doctorname.remove(index);	
		return true;
	}
	
	/**
	 * This method is used to update the doctor in ArrayList
	 * @param dname
	 * @param newname
	 * @return
	 */
	
	public static boolean updateDoctor(String dname,String newname) {
		int index = doctorname.indexOf(dname);
		doctorname.set(index, newname);
		return true;
	}
	
	/**
	 * This method is used to display the doctor list
	 * It returns nothing
	 */
	
	public static void displayDoctor() {
		System.out.println("LIST OF DOCTORS");
		for(int i=0;i < doctorname.size();i++) {
			System.out.println(doctorname.get(i));
		}
	}

}
