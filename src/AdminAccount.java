
public class AdminAccount extends Account{
	
	public AdminAccount(String name, String username, String password,AccountType acctType) {
		super(name, username, password, acctType);
	}
	public AdminAccount() {
		
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
	  Show show=new Show(type, name, time1, time2, description, ratings);
	  dW.writeShowsJSON(show);
  }
  
  public void removeShow(Show show) {
	//if(show.getName()=this.name){
		dW.removeShowsJSON(show);
	}
  }

