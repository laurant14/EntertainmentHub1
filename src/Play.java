/**
 * Creates an ArrayList of plays using the DataLoader
 */

import java.util.ArrayList;

public class Play extends Event {
	private String name;
	private String time1;
	private String time2;
	private String description;
	private String ratings;
	public static ArrayList<Play> plays=new ArrayList<Play>();
	DataLoader dL=new DataLoader();
	Event event;

	/**
	 * This method takes in all attributes of a play and sets the variables 
	 * of the class equal to the parameter variables
	 * @param name-of the play
	 * @param time1-first showing
	 * @param time2-second showing
	 * @param description-of play
	 * @param ratings-of play
	 */	
	public Play(String name, String time1, String time2, String description,String ratings) {
		this.name=name;
		this.time1=time1;
		this.time2=time2;
		this.description=description;
		this.ratings=ratings;
	}

	/**
	 * This method separates plays from the entire showList
	 * @return-and ArrayList of plays
	 */
	public static ArrayList<Play> getPlayList() {
		ArrayList<Show> shows = DataLoader.loadShows();
		for(int i=0;i<shows.size();i++) {
			if(shows.get(i).getshowType().equalsIgnoreCase("Play")){
				plays.add(new Play(shows.get(i).getName(), shows.get(i).gettime1(), shows.get(i).gettime2(), shows.get(i).getDescription(), shows.get(i).getRating()));
			}
		}
		return plays;
	}

	public String toString() {
		return "Name: " +this.name + "\nTime 1: " +this.time1 + "\nTime 2: " + this.time2 + "\nDescription: " +this.description + "\nRating: " +this.ratings + "\n";
	}
}

