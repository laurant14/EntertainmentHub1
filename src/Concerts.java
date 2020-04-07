/**
 * This class creates an ArrayList of concerts using the DataLoader.
 * It searches through the showList ArrayList and separates the shows based on the type (Movies, plays, concerts).
 */

import java.util.ArrayList;

public class Concerts extends Event {
	private String name;
	private String time1;
	private String time2;
	private String description;
	private String ratings;
	public static ArrayList<Concerts> concerts=new ArrayList<Concerts>();
	DataLoader dL=new DataLoader();
	Event event;

	/**
	 * This method takes in all attributes of a concert and sets the variables 
	 * of the class equal to the parameter variables
	 * @param name-of the concert
	 * @param time1-first showing
	 * @param time2-second showing
	 * @param description-of concert
	 * @param ratings-of concert
	 */
	public Concerts(String name, String time1, String time2, String description,String ratings) {
		this.name=name;
		this.time1=time1;
		this.time2=time2;
		this.description=description;
		this.ratings=ratings;
	}


	/**
	 * This method separates concerts from the entire showList
	 * @return-and ArrayList of concerts
	 */
	public ArrayList<Concerts> getConcertList() {
		for(int i=0;i<dL.SHOWLIST.length();i++) {
			if(DataConstants.SHOWLIST_TYPE.equalsIgnoreCase("concert")) {
				concerts.add(new Concerts(dL.SHOWLIST_NAME, dL.SHOWLIST_TIME1, dL.SHOWLIST_TIME2, dL.SHOWLIST_DESCRIPTION, dL.SHOWLIST_RATINGS));
			}
		}
		return concerts;
	}
	
	public String toString() {
		return "Name: " +this.name + "\nTime 1: " +this.time1 + "\nTime 2: " + this.time2 + "\nDescription: " +this.description + "\nRating: " +this.ratings + "\n";
	}
}
