
public class AdminAccount extends Account{
	
	public AdminAccount(String name, String username, String password,AccountType acctType) {
		super(name, username, password, acctType);
	}
	
	Account account;
	AccountType accountType;
	private String name;
	private String time1;
	private String time2;
	private String description;
	private String ratings;
	private String type;
	Show show=new Show(type, name, time1, time2, description, ratings);
	DataWriter dW=new DataWriter();

  public void addShow(String type, String name, String time1, String time2, String description,String ratings) {
	  show.add(new Show(type, name, time1, time2, description, ratings));
	  dW.getShowsJSON(show);
  }
  
  public void removeShow(Show show) {
    dW.removeShowsJSON(show);
  }
}
