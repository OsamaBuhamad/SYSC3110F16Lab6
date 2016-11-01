import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddressBookModelTest {
	private AddressBookModel book;

	@Before
	public void setUp() throws Exception {
		book = new AddressBookModel(); 
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testEmptybook() {
		assertEquals(0, book.size());
	}
	
	@Test
	public void testAddBuddy() {
		BuddyInfo b1 = new BuddyInfo("Osama", "123 LA", "342343",25);
		book.addBuddy(b1);	
		assertEquals(1, book.size());
	}

	@Test
	public void testRemoveBuddy() {
		
		BuddyInfo b1 = new BuddyInfo("Osama", "123 LA", "342343",25);
		BuddyInfo b2 = new BuddyInfo("Leo", "1233 LA", "123456",20);
		book.addBuddy(b1);
		book.addBuddy(b2);
		
		book.removeBuddy(1);
		assertEquals(1, book.size());
		
	}

	@Test
	public void testEditBuddy() {
		BuddyInfo b1 = new BuddyInfo("Osama", "123 LA", "342343",25);
		BuddyInfo b2 = new BuddyInfo("Leo", "1233 LA", "123456",20);
		book.addBuddy(b1);
		book.addBuddy(b2);
		book.editBuddy(1, "Totti","1927 Roma", "1010", 40);
		
		assertEquals("Totti", book.getBuddyAt(1).getName());
		assertEquals("1927 Roma", book.getBuddyAt(1).getAddress());
		assertEquals("1010", book.getBuddyAt(1).getNumber());
		assertEquals(40, book.getBuddyAt(1).getAge());
	}

	@Test
	public void testGetBuddyList() {
		BuddyInfo b1 = new BuddyInfo("Osama", "123 LA", "342343",25);
		BuddyInfo b2 = new BuddyInfo("Leo", "1233 LA", "123456",20);
		book.addBuddy(b1);
		book.addBuddy(b2);
		
		assertEquals(2, book.getBuddyList().size());
	}

	@Test
	public void testGetBuddyList2() {
		BuddyInfo b1 = new BuddyInfo("Osama", "123 LA", "342343",25);
		BuddyInfo b2 = new BuddyInfo("Leo", "1233 LA", "123456",20);
		book.addBuddy(b1);
		book.addBuddy(b2);
		
		assertEquals(2, book.getBuddyList().size());
	}

	@Test
	public void testClear() {
		BuddyInfo b1 = new BuddyInfo("Osama", "123 LA", "342343",25);
		book.addBuddy(b1);
		
		book.clear();
		assertEquals(0,book.getBuddyList().size());
	}
	
	

}
