import java.util.ArrayList;

public class accounts {

	private static accounts accounts = null;
	private static ArrayList<Account> AccountList = new ArrayList<Account>();
	
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
	
	public void addPerson(String name, String username, String password, AccountType acctType) {
		AccountList.add(new Account(name, username, password, acctType));
		DataWriter.saveAccounts();
	}
}
