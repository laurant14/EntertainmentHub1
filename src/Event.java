
public class Event extends Show {
	
	public Event(String type, String name, String time1, String time2, String description, String ratings) {
		super(type, name, time1, time2, description, ratings);
		// TODO Auto-generated constructor stub
	}
	public Event() {
		
	}
	

	protected String name;
	protected String description;
	protected Reviews reviews;
	protected String type;
	protected String time;
	
	
	public String getTime() {
		return this.time;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	
	public Reviews getReviews() {
		return this.reviews;
	}
	
	public void setReviews(String name, Reviews reviews) {
		this.name=name;
		this.reviews=reviews;
	}

}
