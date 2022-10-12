//This is the automated test for appoinments.
//Create a test for add,delete twice.
//Trenton Frey 9/22/22

package AppointmentService;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Calendar;


public class AppointmentServiceTest {
	
	Date date = new Date(2021, Calendar.JULY, 31);
	
	
	@Test
	 public void addAppTest() {
		AppointmentService appointmentService = new AppointmentService("111111111", date, "Booked!");
		 boolean result = appointmentService.addApp("111111111", date, "Booked!");
		 assertTrue(result);
	}
	
	@Test
	public void deleteAppTest() {
		AppointmentService appointmentService = new AppointmentService("111111111", date, "Booked!");
		Appointment a = appointmentService.deleteApp("111111111");
		 assertTrue(a == null);
		
	}
	
	@Test
	 public void deleteAppTest2() {
		AppointmentService appointmentService = new AppointmentService("111111111", date, "Booked!");
		boolean result = appointmentService.addApp("111111111", date, "Booked!");
		 Appointment a = appointmentService.deleteApp("111111111");
		assertTrue(a != null);

	}
	

}
