//This is the automated test for appoinments. We test ids,date and description.
//We have a vaild test to show the correct values.
//Trenton Frey 9/22/22
package AppointmentService;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;
import static org.junit.Assert.assertEquals;


public class AppointmentTest {
		Date date = new Date(2021, Calendar.JULY, 31);
		Appointment appointment = new Appointment("111111111", date, "You are booked!");  //create a appoinment
		
		
		
		@Test
		public void testAppId() {
			String validAppId = "111111111";
			appointment.setAppId(validAppId);
			assertEquals(validAppId, appointment.getAppId());
			
			
			
	}
		
		@Test
		
		public void testAppId2() {
			try {
				String validApptId = "10000000000";
				appointment.setAppId(validApptId);
			}catch  (IllegalArgumentException message) {
				assertEquals("That was wrong...", message.getMessage());
				
			}
		}
		
		@Test
		public void testDate() {
			appointment.setDate(date);
			assertEquals(date, appointment.getDate());
		}
		
		@Test
		public void testDescription() {
			String validDescription = "You are booked!";
			appointment.setDescription(validDescription);
			assertEquals(validDescription, appointment.getDescription());

		}
		
		@Test
		public void testDescription2() {
			try {
				String validDescription = "Booked an appointment for 55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555";
				appointment.setDescription(validDescription);
			}catch(IllegalArgumentException message){
				assertEquals("Why do you keep messing this up...wrong again!", message.getMessage());
			}
		}

}
