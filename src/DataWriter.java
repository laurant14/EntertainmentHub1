/**
 * This class writes to the JSON files
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DataWriter extends DataConstants {

	/**
	 * This method saves the accounts to the JSON file
	 */
	public static void saveAccounts() {
		accounts accounts1 = accounts.getInstance();
		ArrayList<Account> friends = accounts1.getAccount();
		JSONArray jsonFriendsACC = new JSONArray();

		// creating the json objects
		for (int i = 0; i < friends.size(); i++) {
			jsonFriendsACC.add(getAccountJSON(friends.get(i)));
		}

		// Writing the JSON file
		try (FileWriter file = new FileWriter(ACCOUNTS_FILE_NAME)) {

			file.write(jsonFriendsACC.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method adds accounts to the JSON file
	 * @param account-of type Account
	 * @return- a JSONObject
	 */
	public static JSONObject getAccountJSON(Account account) {
		JSONParser parser = new JSONParser();
		Object object;
		try {
			object = parser.parse(new FileReader(ACCOUNTS_FILE_NAME));
			JSONObject accountDetails = (JSONObject) object;
			accountDetails.put(ACCOUNTS_NAME, account.getName());
			accountDetails.put(ACCOUNTS_USERNAME, account.getUsername());
			accountDetails.put(ACCOUNTS_PASSWORD, account.getPassword());
			accountDetails.put(ACCOUNTS_ACCTTYPE, account.getPassword());
			return accountDetails;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * This method writes the shows to the JSON files
	 */
	public static void writeShowsJSON() {
		Showlist showlist = Showlist.getInstance();
		ArrayList<Show> shows = showlist.getShowList();
		JSONArray showsJSONArray = new JSONArray();
		for (int i = 0; i < shows.size(); i++) {
			showsJSONArray.add(createShowsObject(shows.get(i)));
		}
		try (FileWriter file = new FileWriter(SHOWSLIST_FILE_NAME, false)) {

			file.write(showsJSONArray.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * The method returns the JSONObject
	 * @param show-to be added to the JSON file
	 * @return-the JSONObject that has been added
	 */
	public static JSONObject createShowsObject(Show show) {
		
		//FileWriter JSONwriter = new FileWriter(SHOWSLIST_FILE_NAME);
		JSONObject showDetails = new JSONObject();
		showDetails.put(SHOWLIST_TYPE, show.getshowType());
		showDetails.put(SHOWLIST_NAME, show.getName());
		showDetails.put(SHOWLIST_TIME1, show.gettime1());
		showDetails.put(SHOWLIST_TIME2, show.gettime2());
		showDetails.put(SHOWLIST_DESCRIPTION, show.getDescription());
		showDetails.put(SHOWLIST_RATINGS, show.getRating());
		return showDetails;
	}

	/**
	 * This method removes the specified show from the JSON files
	 * @param show-to be removed from the JSON files
	 */
	public static void removeShowsJSON(Show show) {
		JSONObject showDetails1 = new JSONObject();
		showDetails1.remove(SHOWLIST_TYPE, show.getshowType());
		showDetails1.remove(SHOWLIST_NAME, show.getName());
		showDetails1.remove(SHOWLIST_TIME1, show.gettime1());
		showDetails1.remove(SHOWLIST_TIME2, show.gettime2());
		showDetails1.remove(SHOWLIST_DESCRIPTION, show.getDescription());
		showDetails1.remove(SHOWLIST_RATINGS, show.getRating());

		writeShowsJSON();
	}	
}