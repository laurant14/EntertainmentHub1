import java.util.ArrayList;

public class Showlist {

	private static Showlist shows = null;
	private static ArrayList<Show> ShowList = new ArrayList<Show>();
	
	private Showlist() {
		ShowList = DataLoader.loadShows();

	}
	public static Showlist getInstance() {
		if(shows == null) {
			shows = new Showlist();
		}
		return shows;
	}
	
	public ArrayList<Show> getShowList() {
		return ShowList;
	}

	public void addShow(String type, String name, String time1, String time2,
			String description,String ratings ) {
		ShowList.add(new Show(type, name, time1, time2, description, ratings));
		DataWriter.saveShows();
	}
}
