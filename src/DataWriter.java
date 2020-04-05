import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {

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

	public static JSONObject getAccountJSON(Account account) {
		JSONObject accountDetails = new JSONObject();
		accountDetails.put(ACCOUNTS_NAME, account.getName());
		accountDetails.put(ACCOUNTS_USERNAME, account.getUsername());
		accountDetails.put(ACCOUNTS_PASSWORD, account.getPassword());
		accountDetails.put(ACCOUNTS_ACCTTYPE, account.getPassword());

		return accountDetails;
	}
	public static void saveShows() {
		Showlist showlists = Showlist.getInstance();
		ArrayList<Show> friends = showlists.getShowList();
		JSONArray jsonFriendsACC = new JSONArray();

		// creating the json objects
		for (int i = 0; i < friends.size(); i++) {
			jsonFriendsACC.add(getShowsJSON(friends.get(i)));
		}

		// Writing the JSON file
		try (FileWriter file = new FileWriter(ACCOUNTS_FILE_NAME)) {

			file.write(jsonFriendsACC.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONObject getShowsJSON(Show show) {
		JSONObject showDetails = new JSONObject();
		showDetails.put(SHOWLIST_TYPE, show.getshowType());
		showDetails.put(SHOWLIST_NAME, show.getName());
		showDetails.put(SHOWLIST_TIME1, show.gettime1());
		showDetails.put(SHOWLIST_TIME2, show.gettime2());
		showDetails.put(SHOWLIST_DESCRIPTION, show.getDescription());
		showDetails.put(SHOWLIST_RATINGS, show.getRating());
		
		return showDetails;
	}
	
	public static JSONObject removeShowsJSON(Show show) {
		JSONObject showDetails1 = new JSONObject();
		showDetails1.remove(SHOWLIST_TYPE, show.getshowType());
		showDetails1.remove(SHOWLIST_NAME, show.getName());
		showDetails1.remove(SHOWLIST_TIME1, show.gettime1());
		showDetails1.remove(SHOWLIST_TIME2, show.gettime2());
		showDetails1.remove(SHOWLIST_DESCRIPTION, show.getDescription());
		showDetails1.remove(SHOWLIST_RATINGS, show.getRating());
		
		return showDetails1;
	}
	
	
	
}