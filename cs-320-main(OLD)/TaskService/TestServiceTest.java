package TaskService;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestServiceTest {
	public static List<Task> tasks = new ArrayList<>();
	
	@Test public void validTaskData() {
	      Task task = new Task("1000000000", "Camping", "Go camping");
	      addTask(task);
	      System.out.println("New Task: " + tasks);
	      System.out.println("size: " + tasks.size());
	   }
	
	@Test public void invalidID() {      
	      Task task = new Task("2G000000000", "Gaming", "Play favorite game");
	      addTask(task);
	      System.out.println("size: " + tasks.size());
	   }
	
	@Test public void invalidName() {      
	      Task task = new Task("20000000000", "Gaminggggggggg gggggggggg ggggggggggg ggggggggggg", "Play favorite game");
	      addTask(task);
	      System.out.println("size: " + tasks.size());
	   }
	
	@Test public void invalidDescription() {      
	      Task task = new Task("2000000000", "Gaming", "Play favorite game NOWWWWWWWWWWWWWWWW gdfgfdghfdjhfdhjkfdglkhfg fhgjkdjgkdfj dg;dfjkgl;dfk ");
	      addTask(task);
	      System.out.println("size: " + tasks.size());
	   }
	
	 @Test public void existingID() {      
	      Task task = new Task("1000000000", "Gym", "Go to gym");
	      addTask(task);
	      System.out.println("size: " + tasks.size());
	   }
	 
	 @Test public void updateTask() {      
	      Task task = new Task("1000000000", "Camping", "Go camping");
	      update(task);
	      System.out.println("Updated: " + tasks);
	      System.out.println("size: " + tasks.size());
	   }
	   
	   @Test public void deleteTask() {
	      deleteTask("1000000000");
	      System.out.println("size: " + tasks.size());
	   }   
	   
	   public boolean addTask(Task task) {
	       //same thing as in Task.java
	        int index = getIndex(task);

	        
	        if (index < 0 && validateID(task.getId()) && validateName(task.getName()) && validateDescription(task.getDescription())) {
	            tasks.add(task);
	            return true;
	        }
	        
	        return false;
	    }
	   
	   
	   public void deleteTask(String id) {
	        //same dekete as in task.java
	        int index = getIndex(new Task(id, "", ""));
	        
	        
	        if (index >= 0)
	            tasks.remove(index);
	    }
	   
	   
	   //same update as task.java
	   public void update(Task task) {
	        for (Task obj : tasks) {
	            if (obj.equals(task) && validateName(task.getName()) && validateDescription(task.getDescription())) {
	                obj.setName(task.getName());
	                obj.setDescription(task.getDescription());
	            }
	        }
	    }
	   
	   public int getIndex(Task task) {
	        int index = Collections.binarySearch(tasks, task, Task.compareById);
	        return index;
	    }
	   //same length check
	   public boolean validateID(String id) {
	        if (id != null && id.length() <= 10)
	            return true;

	        return false;
	    }
	   
	   public boolean validateName(String name) {
	        if (name != null && name.length() <= 20)
	            return true;

	        return false;
	    }
	   //SAME CHECK FOR DESC
	   public boolean validateDescription(String description) {
	        if (description != null && description.length() <= 50)
	            return true;

	        return false;
	    }

}
