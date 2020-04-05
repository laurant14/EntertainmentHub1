public class AccountIterator extends Venue{
	
	private Account[] accounts;
	private int position = 0;
	
	public AccountIterator(Account[] accounts) {
		this.accounts = accounts;
	}
	
	public boolean hasNext() {
		if(position >= accounts.length || accounts[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public Account next() {
		Account next = accounts[position];
		if(hasNext()) {
			position = position++;
			return next;
		} else {
			return null;
		}
	}
}
