import junit.framework.TestCase;

public class TestMovieListWithTwoMovies extends TestCase {
	
	private MovieList movieList;
	private Movie starWars;
	private Movie starTrek;
	private Movie stargate;
	
	protected void setUp() {
		 movieList = new MovieList();
		 starWars = new Movie("Star Wars");
		 starTrek = new Movie("Star Trek");
		 stargate = null;
		}

	
	public void testSizeAfterAddingTwo() {

		 MovieList twoItemList = new MovieList();
		 twoItemList.add(starWars);
		 twoItemList.add(starTrek);
		 assertEquals("Size of a two item list should be 2.", 2, twoItemList.size());
		}
	
	public void testContents() {
		 movieList.add(starWars);
		 movieList.add(starTrek);
		 assertTrue("List should contain starWars.", movieList.contains(starWars));
		 assertTrue("List should contain starTrek.", movieList.contains(starTrek));
		 assertFalse("List should not contain stargate.", movieList.contains(stargate));
		}

	
	
	public static void main(String[] args) {
	
		junit.textui.TestRunner.run(TestMovieListWithTwoMovies.class);

	}
	

}
