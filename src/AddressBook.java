
import java.util.*;
public class AddressBook {
	private ArrayList buddylist = new ArrayList();
	
	public void addBuddy(BuddyInfo buddy){
		buddylist.add(buddy);
	}
	
	public void removeBuddy(BuddyInfo buddy){
		buddylist.remove(buddy);
	}
	
	public static void main (String[] args){
		System.out.println("Address Book");
		BuddyInfo buddy1 = new BuddyInfo();
		AddressBook addressbook = new AddressBook();
		addressbook.addBuddy(buddy1);
		addressbook.removeBuddy(buddy1);
		//RevisionTest
		addressbook.addBuddy(buddy1);
		addressbook.removeBuddy(buddy1);
		//OnSiteEdit - PullTest
		addressbook.addBuddy(buddy1);
		addressbook.removeBuddy(buddy1);
		
	}
	
}


