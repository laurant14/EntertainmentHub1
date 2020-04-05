
public class RegularAccount extends Account{//either change to extends or make Account it an interface

	public RegularAccount(String name, String username, String password,AccountType acctType) {
		super(name, username, password, acctType);
		// TODO Auto-generated constructor stub
	}
	public RegularAccount() {
		
	}
	
	Account account=new Account();
	AccountType accountType;
	Tickets ticket=new Tickets();

	public void createDiscount() {
		switch(accountType) {
		case Student:
			System.out.println("Students with a school ID receive a 10% discount!");
			account.setDiscount(0.1);
			ticket.setPrice(account.getDiscount()*ticket.getPrice());
			break;
		case Adult:
			System.out.println("Adults do not receive a discount");
			break;
		case Teacher:
			System.out.println("Teachers receive a 20% discount!");
			account.setDiscount(0.2);
			ticket.setPrice(account.getDiscount()*ticket.getPrice());
			break;
		case Senior:
			System.out.println("Seniors receive a 10% discount!");
			account.setDiscount(0.1);
			ticket.setPrice(account.getDiscount()*ticket.getPrice());
			break;
		case Guest:
			System.out.println("Create an account to be able to receive discounts!");
			break;
		case Veteran:
			System.out.println("Veterans receive a 15% discount!");
			account.setDiscount(0.15);
			ticket.setPrice(account.getDiscount()*ticket.getPrice());
			break;
		}
		return;
		
	}

}
