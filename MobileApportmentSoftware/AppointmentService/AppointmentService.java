//This is the backbone for the appoinment feture.
//This handles the add feture and delete feture.
//Trenton Frey 9/22/22

package AppointmentService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentService {
	
	public static List <Appointment> appointmentList; //list containing created appoitments 
	
	public AppointmentService (String appId, Date date, String description) { //create appoiments
		appointmentList = new ArrayList<Appointment>();
	}
	
	
	public static boolean addApp(String appId, Date date, String description) { //logic for input
		for (Appointment appointment : appointmentList) {
			if (appointment.getAppId().equals(appId)) {
				return false;
			}
		}
		appointmentList.add(new Appointment(appId, date, description));
		return true;
		
	}
	public Appointment deleteApp(String appId) {
		//Logic to delete appoitnments from the list
		for (int i = 0; i < appointmentList.size(); i++) {
			if (appointmentList.get(i).getAppId().equals(appId)) {
				Appointment appointment = appointmentList.get(i);
				appointmentList.remove(i);
				return appointment;
			}
		}
		return null;
		
	}

}
