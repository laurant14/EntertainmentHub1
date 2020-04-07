/**
 * Creates an ArrayList of movies using the DataLoader
 */

import java.util.ArrayList;

public class Movie extends Event {
	private String name;
	private String time1;
	private String time2;
	private String description;
	private String ratings;
	public static ArrayList<Movie> movies=new ArrayList<Movie>();
	DataLoader dL=new DataLoader();
	Event event;

	/**
	 * This method takes in all attributes of a movie and sets the variables 
	 * of the class equal to the parameter variables
	 * @param name-of the movie
	 * @param time1-first showing
	 * @param time2-second showing
	 * @param description-of movie
	 * @param ratings-of movie
	 */	
	public Movie(String name, String time1, String time2, String description,String ratings) {
		this.name=name;
		this.time1=time1;
		this.time2=time2;
		this.description=description;
		this.ratings=ratings;
	}

	/**
	 * This method separates movies from the entire showList
	 * @return-and ArrayList of movies
	 */
	public static ArrayList<Movie> getMovieList() {
		ArrayList<Show> shows = DataLoader.loadShows();
		for(int i=0;i<shows.size();i++) {
			if(shows.get(i).getshowType().equalsIgnoreCase("Movie")){
				movies.add(new Movie(shows.get(i).getName(), shows.get(i).gettime1(), shows.get(i).gettime2(), shows.get(i).getDescription(), shows.get(i).getRating()));
			}
		}
		return movies;
	}

	public String toString() {
		return "Name: " +this.name + "\nTime 1: " +this.time1 + "\nTime 2: " + this.time2 + "\nDescription: " +this.description + "\nRating: " +this.ratings + "\n";
	}
}
