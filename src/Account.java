/**
 * This class outlines what is necessary for creating and maintaining an 
 * Account with EntertainmentHub
 */

import java.util.ArrayList;

public class Account {
	protected String username;
	protected String password;
	protected String name;
	protected String cardType;
	protected int cardNum;
	protected int pin;
	protected double expDate;
	protected AccountType acctType;
	protected double discount;
	ArrayList<Account> accounts = new ArrayList<Account>();
	/**
	 * 
	 * @param name-Name of account holder
	 * @param username-Username of account holder
	 * @param password-Password of account holder
	 * @param acctType-Type of account, Student, Adult, Teacher, Senior, Guest, Veteran
	 */
	public Account(String name, String username, String password,AccountType acctType) {
		this.name = name;
		this.username = username;
		this.password = password;
	}
	
	public Account() {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AccountType getAccountType() {
		return this.acctType;
	}

	public void setAccountType(AccountType acctType) {
		this.acctType=acctType;
	}
	
	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double percent) {
		this.discount = percent;
	}

	/**
	 * Parameters defined in constructor at top of class are used below as well
	 * @param name
	 * @param username
	 * @param password
	 * @param acctType
	 * This method takes in the details of an account to be added to the ArrayList 
	 * of accounts
	 */
	public void addAccount(String name, String username, String password, AccountType acctType) {
		Account account = new Account(name, username, password, acctType);	
		accounts.add(account);
	}

	/**
	 * This method takes in the user name and password of a current
	 *  account holder and removes their account from the ArrayList of accounts
	 */
	public void deleteAccount(String username, String password) {
		for (int i = 0; i < accounts.size(); i++) {
			if (username.equals(this.username)) {
				if (password.equals(this.password)) {
					accounts.remove(i);
				}
			}
		}
	}

	/**
	 * This method takes in the user name and password of an existing account and 
	 * verifies its existence, and verifies the login information
	 * @param username
	 * @param password
	 * @return true if the account has successfully logged in
	 */
	public boolean loginAccount(String username, String password) {
		this.username=username;
		for (int i = 0; i < accounts.size(); i++) {
			if (username.equals(this.username)) {
				System.out.println("Login was successful!");
				return password.equals(this.password);
			}
		}
		return false;
	}

	/**
	 * 
	 * @param cardType-to be used as payment by the account holder
	 * @param name-of the account holder
	 * @param cardNum-of the card
	 * @param pin-of the card
	 * @param expDate-of the card
	 * This method takes in all necessary information to make an online payment
	 */
	public void addPayment(String cardType, String name, int cardNum, int pin, double expDate) {
		this.cardType = cardType;
		this.name = name;
		this.cardNum = cardNum;
		this.pin = pin;
		this.expDate = expDate;
	}
}
