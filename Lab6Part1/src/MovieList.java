import java.util.ArrayList;

public class MovieList {
	
	private ArrayList movieList; 
	
	public MovieList(){
		movieList = new ArrayList<String>(); 
	}

	public int size() {
		
		return movieList.size();
	}

	public void add(Movie movie) {
		movieList.add(movie);	
	}

	public boolean contains(Movie movie) {
		if(movieList.contains(movie))
			return true; 
		return false;
	}

}
