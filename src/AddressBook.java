
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
		
	}
	
}


