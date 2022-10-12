package contact;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ContactServiceTest {
	
	@Test
	public void testAdd() { //add test
		
		ContactService cs = new ContactService();
		Contact test1 = new Contact("4545454","Jim","Joe","4345432344","Road 43 Drive");  //test to add 
		assertEquals(true, cs.addContact(test1));
		
	}
	@Test
	public void testDelete() { //delete test
		ContactService cs = new ContactService();
		
		
		
		Contact test1=new Contact("4545454","Jim","Joe","4345432344","Road 43 Drive");
		Contact test2=new Contact("1234532","Dude","Man","5029424524","Road 50 Drive");
		Contact test3=new Contact("9482345","Super","Jim","3263843285","Road 76 Drive");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		assertEquals(true,cs.deleteContact("2345653"));
		assertEquals(false,cs.deleteContact("2345652")); //Delete
		assertEquals(false,cs.deleteContact("2345657"));
	}
	
	@Test
	public void testUpdate() {
		
           ContactService cs = new ContactService();
		
		
		
		Contact test1=new Contact("4545454","Jim","Joe","4345432344","Road 43 Drive");
		Contact test2=new Contact("1234532","Dude","Man","5029424524","Road 50 Drive");
		Contact test3=new Contact("9482345","Super","Jim","3263843285","Road 76 Drive");
		
		cs.addContact(test1);
		cs.addContact(test2);
		cs.addContact(test3);
		
		
		assertEquals(true,cs.updateContact("9232494","Mario","Bro","8345682344","Bowser Land"));
		assertEquals(false,cs.updateContact("9232494","Mario","Bro","8345682344","Bowser Land"));
		
	}

}
