//This is the main backbone for workflow items. This service provides an add feature, delete feature,update feature.
//Built in verifcation to check string length
//Trenton Frey 9/21/22

package WorkFlow; 
import java.util.*;
public class WorkService {
	
	public static List<Work>work=new ArrayList<>();
	
	public static void main(String[]args) {
		
		//This is used for the main work service and creation
        WorkService service = new WorkService();

       //Adding in starting workflow items
        service.addWork(new Work("1", "Youtube", "Create a new youtube video."));
        service.addWork(new Work("2", "Meeting", "Atend the zoom meeting for the new sprint."));
        service.addWork(new Work("3", "Develop", "Contiune adding features to the new site."));
        //method for displaying workflow items in the array
        for(Work obj: work) {
        	System.out.println(obj); 
        	
        }
        
        //add workflow item to delete
        service.addWork(new Work("6", "Clean Office", "Clean up office space for secirity and focus."));

        System.out.println("Delete Work ID #6");
        service.deleteTask("2");
		//adding item to update
        System.out.println("Update Work ID #3");
        service.update(new Work("3", "Prepare Notes", "Prepare documents for the next meeting."));

        //display updated list of workflow items
        for (Work obj : work) {
            System.out.println(obj);
        }
		
	
	}
	//method for  adding a workflow item
	public boolean addWork(Work work) {
        
        int index = getIndex(work);
        
        //statment to check if the item is vaild 
        if (index < 0 && validateID(work.getId()) && validateName(work.getName()) && validateDescription(work.getDescription())) {
            work.add(work);
            return true;
        }
        
        return false;
    }
	//method to delete a workflow item
	public void deleteWork(String id) {
        
        int index = getIndex(new Work(id, "", ""));
        
        
        if (index >= 0)
            work.remove(index);
    }
	
	//Method to update an existing workflow item
	  public void update(Work work) {
	        for (Work obj : work) {
	            if (obj.equals(work) && validateName(work.getName()) && validateDescription(work.getDescription())) {
	                obj.setName(work.getName());
	                obj.setDescription(work.getDescription());
	            }
	        }
	    }
	  
	  
	  
	  //Method for checking workflow id creation
	  public int getIndex(Work work) {
	        int index = Collections.binarySearch(work, work, Work.compareById);
	        return index;
	    }
	 
	  
	  //method for checking id length
	  public boolean validateID(String id) {
	        if (id != null && id.length() <= 10)
	            return true;

	        return false;
	    }
	  
	  
	  //Method for  checking workflow item name length
	  public boolean validateName(String name) {
	        if (name != null && name.length() <= 20)
	            return true;

	        return false;
	    }
	  
	  
	  //Method for  checking workflow item description length
	  public boolean validateDescription(String description) {
	        if (description != null && description.length() <= 50)
	            return true;

	        return false;
	    }
	  
	  
	

}
