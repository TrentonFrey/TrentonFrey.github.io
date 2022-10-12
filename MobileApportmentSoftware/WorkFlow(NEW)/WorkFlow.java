//This is the main code for the new workflow feture
//Creates three main parts for a work item in the workflow. ID, Name and description.
//Trenton Frey 9/21/22
package WorkFlow;
import java.util.*;
public class Work {
	//Create 3 main objects
	private String id;
	private String name;
	private String description;
	
	//Method for creating a workfow item
	public Work(String id, String name, String description) {
		this.id=id;
		this.name=name;
		this.description=description;
		
	}
	//Method for workflow ID
    public String getId() {
        return id;
    }

    //Method for setting the ID
    public void setId(String id) {
        this.id = id;
    }
	//Method for workflow item name

    public String getName() { 
        return name;
    }
    //Method for setting the workflow item name
    public void setName(String name) {
        this.name = name;
    }
    //Method for workflow item description
    public String getDescription() {
        return description;
    }
    //Method for setting the workflow item description
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    //Method for creating the workflow item.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (this.getClass() != obj.getClass())
            return false;

        Work w = (Work) obj;
        return getId().equals(t.getId());
    }
    
    
    //Compare method. Check each work item using the id
    
    public static Comparator<Work> compareById = new Comparator<Work>() {
        @Override
        public int compare(Work t1, Work t2) {
            return t1.getId().compareTo(t2.getId());
        }
    };
    
    
    //Show the workflow item that was created
    @Override
    public String toString() {
        return "Work ID: " + getId() + "\nName: " + getName() + "\nDescription: " + getDescription() + "\n";
    }
    
	
	

}
