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

	public Account(String name, String username, String password,AccountType acctType) {
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public Account() {
		
	}

	ArrayList<Account> accounts = new ArrayList<Account>();
	int count;
	double discount;

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

	public void addAccount(String name, String username, String password, AccountType acctType) {
		Account account = new Account(name, username, password, acctType);	

		accounts.add(account);
	}

	public void deleteAccount(String username, String password) {
		for (int i = 0; i < accounts.size(); i++) {
			if (username.equals(this.username)) {
				if (password.equals(this.password)) {
					accounts.remove(i);
				}
			}
		}
	}

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

	public void addPayment(String cardType, String name, int cardNum, int pin, double expDate) {
		this.cardType = cardType;
		this.name = name;
		this.cardNum = cardNum;
		this.pin = pin;
		this.expDate = expDate;
	}

	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double percent) {
		this.discount = percent;
	}

	// have an isDisabled boolean- to ask are u disabled?
	// need setters and getters, will help

	public boolean isDisabled() {
		boolean isTrue = true;
		if (isTrue == true) {
			return true;
		} else {
			return false;
		}
	}
}
