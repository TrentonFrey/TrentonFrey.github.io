//This is the main code for the task reqirument from the customer.
//Creates three parts for a task item to be used in the task section of the application. ID, Name and description.
//Enahnced by re doing comments and making code easiler understandable
//Trenton Frey 9/22/22

package TaskService;
import java.util.*;
public class Task {
	private String id;
	private String name;
	private String description;
	
	//The items for the task
	public Task(String id, String name, String description) {
		this.id=id;
		this.name=name;
		this.description=description;
		
	}
	
    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    @Override
	//method for checking the tasks  already made
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        Task t = (Task) obj;
        return getId().equals(t.getId());
    }
  
    
    
    //Comparing the ID of tasks
    public static Comparator<Task> compareById = new Comparator<Task>() {
        @Override
        public int compare(Task t1, Task t2) {
            return t1.getId().compareTo(t2.getId());
        }
    };
    //end compare
    
    //Start Return
    @Override
    public String toString() {
        return "Task ID: " + getId() + "\nName: " + getName() + "\nDescription: " + getDescription() + "\n";
    }
    //end return
	
	

}
