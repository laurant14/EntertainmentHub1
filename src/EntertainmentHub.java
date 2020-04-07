/**
 * This class acts as a method helper to the driver
 * Contains methods that are essential to the running of the driver
 */

import java.util.ArrayList;

public class EntertainmentHub {

	Venue venue=new Venue();

	public EntertainmentHub() {

	}

	/**
	 * This method prints out the ArrayList of movies created in the Movie class
	 */
	public void getMovies() {
		ArrayList<Movie> movies= Movie.getMovieList();
		for(int i=0;i<movies.size();i++) {
			System.out.println(movies.get(i));
		}
	}

	/**
	 * This method prints out the ArrayList of plays created in the Play class
	 */
	public void getPlays() {
		ArrayList<Play> plays=Play.getPlayList();
		for(int i=0;i<plays.size();i++) {
			System.out.println(plays.get(i));
		}
	}

	/**
	 * This method prints out the ArrayList of concerts created in the Concerts class
	 */
	public void getConcerts() {
		for(int i=0;i<Concerts.concerts.size();i++) {
			System.out.println(Concerts.concerts.get(i));
		}
	}
}
