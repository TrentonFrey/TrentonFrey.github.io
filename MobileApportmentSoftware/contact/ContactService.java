//Backbone of contact info input for the contact service.
//We add contacts,delete contacts and update contacts here
//Created length rules for each section of contact info
//Trenton Frey 9/22/22
package contact;
import java.util.*;
//main source of contacts
public class ContactService {
	private ArrayList<Contact> contacts;
	
	
	public ContactService() {
		contacts=new ArrayList<>();  //Start of list
	}
	public boolean addContact(Contact contact){ //add contacts can only be true or false
		
		boolean contactAlready=false;
		
		
		for(Contact contactList:contacts) {  //loop to go through all contacts in array
			
			
			if(contactList.equals(contact)) { //check to see if contact exist. If not create.
				contactAlready=true;
			}
			
			
			
		}
		if(!contactAlready) {
			contacts.add(contact);
			
			return true;
		}
		else {
			return false;
		}
			
	}
	
	public boolean deleteContact(String contactID) {  //Deleteing contact
		
		for(Contact contactList:contacts) {
			if(contactList.getContactID().equals(contactID)) {
				contacts.remove(contactList);
				return true;
			}
		}
		return false;
		
		
		//Updating checking parameters
		
		
			
		}
	
	public boolean updateContact(String contactID,String firstName,String lastName,String phoneNumber,String address) {
		for (Contact contactList:contacts) {
			if(contactList.getContactID().equals(contactID)) {
				if(!firstName.equals("")&&!(firstName.length()>10)) {
					contactList.setFirstName(firstName);
				}
				if(lastName.equals("")&&!(lastName.length()>10)) {
					contactList.setFirstName(lastName);
				}
				if(!phoneNumber.equals("")&&(phoneNumber.length()==10)) {
					contactList.setFirstName(phoneNumber);
				}
				if(!address.equals("")&&!(address.length()>30)){
					contactList.setFirstName(address);
				}
				return true;
				
				
			}
		}
		return false;
	}
		
	}    


