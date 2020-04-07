/**
 * 
 * This class gives structure to the attributes needed for an 
 * event (such as a movie, play, concert).  
 *
 */

public class Event extends Show {
	
	protected String name;
	protected String description;
	protected Reviews reviews;
	protected String type;
	protected String time;

	/**
	 * This constructor uses the super constructor from the Show class
	 * @param type-of event(Movie, play, concert)
	 * @param name-of show
	 * @param time1-first showing
	 * @param time2-second showing
	 * @param description-of show
	 * @param ratings-of show
	 */
	public Event(String type, String name, String time1, String time2, String description, String ratings) {
		super(type, name, time1, time2, description, ratings);
		// TODO Auto-generated constructor stub
	}
	
	public Event() {

	}

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
