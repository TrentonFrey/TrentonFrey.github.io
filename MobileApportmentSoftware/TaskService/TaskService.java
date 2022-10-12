//This is the main backbone for creating tasks. This service provides an add feature, delete feature,update feature.
//Built in verifcation to check input length
//Trenton Frey 9/22/22

package TaskService; 
import java.util.*;
public class TaskService {
		
	
	public static List<Task>tasks=new ArrayList<>();
	
	
	public static void main(String[]args) {
		
		//Create a standard set of task already in the system
        TaskService service = new TaskService();

       
        service.addTask(new Task("1000000000", "Gym", "Go to the gym"));
        service.addTask(new Task("2000000000", "Biking", "Go for a bike ride"));
        service.addTask(new Task("3000000000", "Gaming", "Play your favorite  game"));
        
        for(Task obj: tasks) {
        	System.out.println(obj); //display task
        	
        	
        }
        
        //Set to delete and update task
        service.addTask(new Task("1000000000", "Eating", "Eat food"));
        System.out.println("Delete Task ID #2000000000");
        service.deleteTask("2000000000");
        System.out.println("Update Task ID #3000000000");
        service.update(new Task("3000000000", "Study", "Study everything always"));

        //display
        for (Task obj : tasks) {
            System.out.println(obj);
        }
		
	
	}
	//Check id of new task
	public boolean addTask(Task task) {
        
        int index = getIndex(task);
        
        //logic to see if it exists
        if (index < 0 && validateID(task.getId()) && validateName(task.getName()) && validateDescription(task.getDescription())) {
            tasks.add(task);
            return true;
        }
        
        return false;
    }
	//Logic to delete task based of if ID
	public void deleteTask(String id) {
        
        int index = getIndex(new Task(id, "", ""));
        
        
        if (index >= 0)
            tasks.remove(index);
    }
	
	//MESS logic to update the task if the id is the same
	  public void update(Task task) {
	        for (Task obj : tasks) {
	            if (obj.equals(task) && validateName(task.getName()) && validateDescription(task.getDescription())) {
	                obj.setName(task.getName());
	                obj.setDescription(task.getDescription());
	            }
	        }
	    }
	  //End of mess 
	  
	  
	  //Check id
	  public int getIndex(Task task) {
	        int index = Collections.binarySearch(tasks, task, Task.compareById);
	        return index;
	    }
	  //end id check
	  
	  //start id check length
	  public boolean validateID(String id) {
	        if (id != null && id.length() <= 10)
	            return true;

	        return false;
	    }
	  //end id length check
	  
	  //start name length check 
	  public boolean validateName(String name) {
	        if (name != null && name.length() <= 20)
	            return true;

	        return false;
	    }
	  //end name length check
	  
	  //start check for desc
	  public boolean validateDescription(String description) {
	        if (description != null && description.length() <= 50)
	            return true;

	        return false;
	    }
	  //end check for desc
	  
	  //end Task service
	  
	

}
