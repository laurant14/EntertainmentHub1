/**
 * This class allows for an admin account holder (ex. Employee) to write shows 
 * to the JSON file or remove shows from the JSON file
 */

import java.util.ArrayList;

public class AdminAccount extends Account {
	
	
	private String name;
	private String time1;
	private String time2;
	private String description;
	private String ratings;
	private String type;
	Account account;
	AccountType accountType;
	Show show=new Show(type, name, time1, time2, description, ratings);
	DataWriter dW=new DataWriter();

	/**
	 * Takes the super constructor from class Account and creates an Admin Account
	 * @param name
	 * @param username
	 * @param password
	 * @param acctType
	 */
	public AdminAccount(String name, String username, String password,AccountType acctType) {
		super(name, username, password, acctType);
	}
	
	public AdminAccount() {

	}

	/**
	 * This method takes in all the attributes of a show, creates the show, and 
	 * writes it to the JSON file
	 * @param type-of show (Movie, Play, Concert)
	 * @param name-of show
	 * @param time1-first showing of show
	 * @param time2-second showing of show
	 * @param description-of the show
	 * @param ratings-given to the show
	 */
	public void addShow(String type, String name, String time1, String time2, String description,String ratings) {
		Show show=new Show(type, name, time1, time2, description, ratings);
		Showlist showList = Showlist.getInstance();
		showList.addShow(type, name, time1, time2, description, ratings);
		
	}

	/**
	 * This method searches through the ArrayList of shows, locates the show based 
	 * on the name, and removes it from the JSON files
	 * @param name-of the show (ex. Frozen)
	 */
	public void removeShow(String name) {
		ArrayList<Show> shows = DataLoader.loadShows();
		for(int i=0;i<shows.size();i++) {
			if(shows.get(i).getName().equals(name)) {
				dW.removeShowsJSON(shows.get(i));
			}
		}
	}
}

