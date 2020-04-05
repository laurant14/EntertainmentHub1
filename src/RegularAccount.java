
public class RegularAccount extends Account{//either change to extends or make Account it an interface

	public RegularAccount(String name, String username, String password,AccountType acctType) {
		super(name, username, password, acctType);
		// TODO Auto-generated constructor stub
	}
	public RegularAccount() {
		
	}
	
	public Account account=new Account();
	
	public static final double STUDENT_DISCOUNT = 0.1;
	public static final double TEACHER_DISCOUNT = 0.2;
	public static final double SENIOR_DISCOUNT = 0.1;
	public static final double VETERAN_DISCOUNT = 0.15;

	public void createDiscount(Tickets ticket) {
		AccountType acctType=this.account.getAccountType();
		switch(acctType) {
		case Student:
			System.out.println("Students with a school ID receive a 10% discount!");
			ticket.setPrice((1-STUDENT_DISCOUNT)*ticket.getPrice());
			break;
		case Adult:
			System.out.println("Adults do not receive a discount");
			break;
		case Teacher:
			System.out.println("Teachers receive a 20% discount!");
			ticket.setPrice((1-TEACHER_DISCOUNT)*ticket.getPrice());
			break;
		case Senior:
			System.out.println("Seniors receive a 10% discount!");
			ticket.setPrice((1-SENIOR_DISCOUNT)*ticket.getPrice());
			break;
		case Guest:
			System.out.println("Create an account to be able to receive discounts!");
			break;
		case Veteran:
			System.out.println("Veterans receive a 15% discount!");
			ticket.setPrice((1-VETERAN_DISCOUNT)*ticket.getPrice());
			break;
		}
		return;
		
	}

}
