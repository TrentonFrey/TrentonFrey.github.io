//automated test file used for testing the task createtion.
//Trenton Frey 9/22/22


package TaskService;

import org.junit.Test;

//Test createtion
public class TaskTest {
	@Test public void createValidTaskData() {
	      Task task = new Task("1000000000", "Camping", "Go camping");
	      System.out.println(task);
	   }

}
