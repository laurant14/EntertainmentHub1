/**
 * This class loads the list of account from the DataLoader class
 */

import java.util.ArrayList;

public class accounts {

	private static accounts accounts = null;
	private static ArrayList<Account> AccountList = new ArrayList<Account>();
	
	/**
	 * Loads the ArrayList of accounts from DataLoader to AccountList
	 */
	private accounts() {
		AccountList = DataLoader.loadAccounts();

	}
	public static accounts getInstance() {
		if(accounts == null) {
			accounts = new accounts();
		}
		return accounts;
	}
	
	public ArrayList<Account> getAccount() {
		return AccountList;
	}
	
	/**
	 * This method adds a new account using the information from the DataWriter class
	 * @param name-of account holder
	 * @param username-created by account holder
	 * @param password-created by account holder
	 * @param acctType-of the account chosen by account holder, ex. Student
	 */
	public void addPerson(String name, String username, String password, AccountType acctType) {
		AccountList.add(new Account(name, username, password, acctType));
		DataWriter.saveAccounts();
	}
}
