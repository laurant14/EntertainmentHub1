/**
 * This class holds the information of a venue
 */

public class Venue  {
	private String title;
	private double price;
	private String description;
	private String name;
	private String location;
	private Reviews review;
	private Tickets ticket;


	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title=title;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price=price;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description=description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location=location;
	}

	public Reviews getReview() {
		return this.review;
	}

	public Tickets getTicket() {
		return this.ticket;
	}
	
	public String toString() {
		return "Name: " +this.name + "\nLocation: " + this.location;
	}
}
