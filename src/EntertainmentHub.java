import java.util.ArrayList;

public class EntertainmentHub {
	Venue venue=new Venue();
	//Movie movie=new Movie();
	
	public EntertainmentHub() {
		
	}
	
	public void getMovies() {
		ArrayList<Movie> movies= Movie.getMovieList();
		for(int i=0;i<movies.size();i++) {
			System.out.println(movies.get(i));
		}
	}
	
	public void getPlays() {
		ArrayList<Play> plays=Play.getPlayList();
		for(int i=0;i<plays.size();i++) {
			System.out.println(plays.get(i));
		}
	}
	
	public void getConcerts(){
		for(int i=0;i<Concerts.concerts.size();i++) {
			System.out.println(Concerts.concerts.get(i));
		}
	}

	public ArrayList<Show> getMovieShows(String movieName, Venue venue){
		venue.getShowing(movieName);
		return null;
	}
	public Movie getMovie(String movieName) {
		return null;
	}
}
