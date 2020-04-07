/**
 * This class allows for the reading of the JSON files
 */

import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {

	/**
	 * This method loads all the accounts from the JSON file
	 * @return-an ArrayList of accounts
	 */
	public static ArrayList<Account> loadAccounts() {
		ArrayList<Account> accounts = new ArrayList<Account>();

		try {
			JSONParser parser = new JSONParser();
			Object object = parser.parse(new FileReader(ACCOUNTS_FILE_NAME));
			JSONObject data = (JSONObject) object;
			for(int i=0; i < data.size(); i++) {
				JSONObject accountJSON = (JSONObject)data.get(i);
				String name = (String)accountJSON.get(ACCOUNTS_NAME);
				String username = (String)accountJSON.get(ACCOUNTS_USERNAME);
				String password = (String)accountJSON.get(ACCOUNTS_PASSWORD);
				AccountType acctType = (AccountType)accountJSON.get(ACCOUNTS_ACCTTYPE);	
				accounts.add(new Account(name, username, password, acctType));
			}
			return accounts;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * This method loads all the shows from JSON files
	 * @return-an ArrayList of shows
	 */
	public static ArrayList<Show> loadShows() {
		ArrayList<Show> showslist = new ArrayList<Show>();

		try {
			JSONParser parser = new JSONParser();
			Object object = parser.parse(new FileReader(SHOWSLIST_FILE_NAME));
			JSONArray showData = (JSONArray) object;
			for(int i=0; i <showData.size(); i++) {
				JSONObject showsJSON = (JSONObject)showData.get(i);
				String showType = (String)showsJSON.get(SHOWLIST_TYPE);
				String showName = (String)showsJSON.get(SHOWLIST_NAME);
				String time1 = (String)showsJSON.get(SHOWLIST_TIME1);
				String time2 = (String)showsJSON.get(SHOWLIST_TIME2);
				String description = (String)showsJSON.get(SHOWLIST_DESCRIPTION);
				String rating = (String)showsJSON.get(SHOWLIST_RATINGS);
				showslist.add(new Show(showType,showName,time1,time2,description, rating));
			}
			return showslist;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}