package in.hospital;

import java.util.ArrayList;
import java.util.List;

public class DoctorDetails {
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
	
	// delete doctor in arrayList
	
	public static boolean deleteDoctor(String dname) {
		int index = doctorname.indexOf(dname);
		doctorname.remove(index);	
		return true;
	}
	
	//update doctor in arrayList
	
	public static boolean updateDoctor(String dname,String newname) {
		int index = doctorname.indexOf(dname);
		doctorname.set(index, newname);
		return true;
	}
	
	public static void displayDoctor() {
		System.out.println("LIST OF DOCTORS");
		for(int i=0;i < doctorname.size();i++) {
			System.out.println(doctorname.get(i));
		}
	}

}
