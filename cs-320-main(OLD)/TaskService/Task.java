package TaskService;
import java.util.*;
public class Task {
	private String id;
	private String name;
	private String description;
	
	//Setting vars
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
    //end of var set
    
    //Start of logic, check if equal. if return true, null is false, not equal is false.
    @Override
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
    //End logic
    
    //Compare 
    
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
