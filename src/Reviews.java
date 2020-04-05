public class Reviews {
	Account account=new Account();
	protected int stars;
	protected String comment;
	
	public Reviews(String username, int stars, String comment) {
		account.username=username;
		this.stars=stars;
		this.comment=comment;	
	}
	public Reviews() {

	}

	public int getStars() {
		return this.stars;
	}
	
	public String getComment() {
		return this.comment;
	}
	
	public Account getAccount() {
		return this.account;
	}
	
	public void setStars(int stars) {
		if (this.stars >= 1 && this.stars <= 5)
			this.stars = stars;
	}
	
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	//getReview from UML is now this printReview 
	public String toString() {
		return "Username: " + account.username + "\nStars: " + this.stars + "\nComment: " +this.comment;
	}
}
