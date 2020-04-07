/**
 * Creates an ArrayList of shows and returns the arrayList
 */

import java.util.ArrayList;


public class Theater extends Show {
	ArrayList<Show> showList=new ArrayList<Show>();

	/**
	 * Uses super constructor from show class
	 * @param username-of the account holder
	 * @param stars-given to show
	 * @param comment-given to show
	 */
	public Theater(String username, int stars, String comment) {
		super(username, stars, comment);
	}

	/**
	 * This method loops through the arrayList of shows and returns them
	 * @return-type show
	 */
	public Show getShows() {
		for(int i=0;i<showList.size();i++) {
			return showList.get(i);//why isn't it returning type show when the arrayList is of type show?
		}
		return getShows();
	}

	/**
	 * This method loops through the ArrayList of shows and returns the show that 
	 * matches the entered movieName
	 * @param movieName
	 * @return-ArrayList of type Show
	 */
	public ArrayList<Show> getShows(String movieName) {
		ArrayList<Show> shows=new ArrayList<Show>();
		{
			for(int i=0;i<showList.size();i++) {
				if(showList.get(i).getEvent().getName().equals(movieName)) {
					shows.add(showList.get(i));
				}
			}
			return shows;
		}
	}
}
