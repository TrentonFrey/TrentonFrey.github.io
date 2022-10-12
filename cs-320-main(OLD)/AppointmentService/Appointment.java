package AppointmentService;
import java.util.Date;
public class Appointment {
	
	private String description; //Main vars
	private String appId;
	private Date date;
	
	public Appointment (String appId, Date date, String description) {
		
		 this.appId = appId;
		 this.description = description;   //Set vars to correct value
		 this.date = date;
		
	}
	public String getAppId() {
		return appId; //appoinment accessor
		
	}
	
	public void setAppId(String appId) {
		if ((appId.length() > 10 || appId == null)) {
			throw new IllegalArgumentException("Invalid"); //Logic to check length of appoinment
			
		}
		
		this.appId = appId;
	}
	
	public Date getDate() { //date accessor
		return date;
	}
	
	public void setDate (Date date) { //Logic to make sure date is a vaild date
		Date currentDate = new Date();
		if ((!currentDate.before(date))) {
			throw new IllegalArgumentException("That was wrong, why did you do that?");
		}
		this.date = date;
	}
	
	public String getDescription() { //Description accessro
		return description;

	}
	
	public void setDescription (String description) { //Logic to make sure description is correct
		if ((description.length() > 50 || description == null)) {
			throw new IllegalArgumentException("That was wrong, why did you do that?");
		}
		this.description = description;
	}
	
	
		
	
	
	

}
