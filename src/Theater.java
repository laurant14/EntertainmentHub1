import java.util.ArrayList;


public class Theater extends Show{
	
	public Theater(String username, int stars, String comment) {
		super(username, stars, comment);
	}


	ArrayList<Show> showList=new ArrayList<Show>();
	
	
	public Show getShows() {
		for(int i=0;i<showList.size();i++) {
			return showList.get(i);//why isn't it returning type show when the arrayList is of type show?
		}
		return getShows();
	}
	
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
