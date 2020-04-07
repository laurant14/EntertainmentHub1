/**
 * This class uses a Singleton Design Pattern
 * This class populates and ArrayList of shows from the DataLoader class
 */
import java.util.ArrayList;

public class Showlist {
	private static ArrayList<Show> ShowList = new ArrayList<Show>();
	private static Showlist showlist;
	
	/**
	 * This method allows for only one instance of the class Showlist to be 
	 * accessed and modified
	 * @return-instance of Showlist
	 */
	public static Showlist getInstance() {
		if(showlist==null) {
			showlist=new Showlist();
		}
		return showlist;
	}
	
	private Showlist() {
		this.ShowList = DataLoader.loadShows();
	}

	public ArrayList<Show> getShowList() {
		return this.ShowList;
	}

	/**
	 * This method adds the show with the parameterized attributes to the ShowList arrayList
	 * @param type-of show(movie, play, concert)
	 * @param name-of show
	 * @param time1-first showing
	 * @param time2-second showing
	 * @param description-of show
	 * @param ratings-of show
	 */
	public void addShow(String type, String name, String time1, String time2, String description,String ratings ) {
		this.ShowList.add(new Show(type, name, time1, time2, description, ratings));
		DataWriter.writeShowsJSON();
	}
}
