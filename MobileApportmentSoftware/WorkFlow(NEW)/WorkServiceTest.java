//This is an automated test used for testing the creation of a workflow item. Test for workflow.
//Creates a vaild test for the creation of a workflow item.
//Trenton Frey 9/21/22
package WorkFlow;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkServiceTest {
	public static List<Work> work = new ArrayList<>();
	
	//This is a test example of the correct input expected
	@Test public void validWorkData() {
	      Work work = new Work("12", "Service Test", "Service test for vaild work flow additon");
	      addWork(work);
	      System.out.println("New Work Flow added: " + work);
	      System.out.println("size: " + work.size());
	   }
	//Test for unexpected ID. Fail input if letters are in id
	@Test public void invalidID() {      
	      Work work = new Work("53ted", "Service Test", "Service Test for invald ID. Only numbers accepted");
	      addWork(work);
	      System.out.println("size: " + work.size());
	   }
	//Test for having to long of a name 
	@Test public void invalidName() {      
	      Work work = new Work("20000000000", "Service Test Service Test Service Test Service Test Service Test Service Test ", "Service Test for work flow name length");
	      addWork(work);
	      System.out.println("size: " + work.size());
	   }
	//Test for having to long of a description
	@Test public void invalidDescription() {      
	      Work work = new Work("13", "Service Test", "Service Test for description length.Service TestService TestService TestService TestService TestService TestService Test ");
	      addWork(work);
	      System.out.println("size: " + work.size());
	   }
	//Test for existing id for workflow item
	 @Test public void existingID() {      
	      Work work = new Work("1", "Service Test", "Service Test, invald if id exists");
	      addWork(work);
	      System.out.println("size: " + work.size());
	   }
	 //Test for updateing an exsting workflow item
	 @Test public void updateWork() {      
	      Work work = new Work("11", "Service Test", "Service Test for updateing");
	      update(work);
	      System.out.println("Updated: " + work);
	      System.out.println("size: " + work.size());
	   }
	   //Test to delete exsting workflow item
	   @Test public void deleteWork() {
	      deleteWork("13");
	      System.out.println("size: " + work.size());
	   }   
	   //Test for adding a workflow item
	   public boolean addWork(Work work) {
	       
	        int index = getIndex(work);

	        
	        if (index < 0 && validateID(work.getId()) && validateName(work.getName()) && validateDescription(work.getDescription())) {
	            work.add(work);
	            return true;
	        }
	        
	        return false;
	    }
	   
	   //Test to delete existing workflow item
	   public void deleteWork(String id) {
	        
	        int index = getIndex(new Work(id, "", ""));
	        
	        
	        if (index >= 0)
	            work.remove(index);
	    }
	   
	   
	   //Test to update existing workflow item
	   public void update(Work work) {
	        for (Work obj : work) {
	            if (obj.equals(work) && validateName(work.getName()) && validateDescription(work.getDescription())) {
	                obj.setName(work.getName());
	                obj.setDescription(work.getDescription());
	            }
	        }
	    }
	   
	   public int getIndex(Work work) {
	        int index = Collections.binarySearch(work, work, Work.compareById);
	        return index;
	    }
	   //Length check for id
	   public boolean validateID(String id) {
	        if (id != null && id.length() <= 10)
	            return true;

	        return false;
	    }
	   //Length check for name 
	   public boolean validateName(String name) {
	        if (name != null && name.length() <= 20)
	            return true;

	        return false;
	    }
	   //description length check
	   public boolean validateDescription(String description) {
	        if (description != null && description.length() <= 50)
	            return true;

	        return false;
	    }

}
