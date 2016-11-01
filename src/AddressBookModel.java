import java.util.ArrayList;
import java.util.Observable;

import javax.swing.DefaultListModel;


public class AddressBookModel extends Observable {
//	private ArrayList <BuddyInfo> buddyList;
	
	private DefaultListModel<BuddyInfo> buddyList = new DefaultListModel<BuddyInfo>();
	
	public AddressBookModel(){
		buddyList = new DefaultListModel<BuddyInfo>(); 
	}
	
	public void addBuddy(BuddyInfo b){
		if(b != null){
		buddyList.addElement(b);
		setChanged();
		notifyObservers();
		}
		
	}
	
	public void removeBuddy(int i){
		if (i>=0 && i<buddyList.size()){
			buddyList.remove(i);
			
			setChanged();
			notifyObservers();
			 
		}
	}
	
	public void editBuddy(int i, String name, String address, String number, int age){
		buddyList.getElementAt(i).setName(name);
		buddyList.getElementAt(i).setAddress(address);
		buddyList.getElementAt(i).setNumber(number);
		buddyList.getElementAt(i).setAge(age);
		
		
		setChanged();
		notifyObservers();
	}
	
	public DefaultListModel<BuddyInfo> getBuddyList() {
		return buddyList;
	}
	
	public DefaultListModel getBuddyList2() {
		return buddyList;
	}
	
	public BuddyInfo getBuddyAt(int index){
		return buddyList.getElementAt(index);
	}
	
	public int size(){
		return buddyList.size();
	}
	
	public void clear(){
		buddyList.clear();
	}
	

}
