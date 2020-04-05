public class Tickets {
	protected Show show;
	protected String time; 
	protected double price;
	
	public Tickets(Show show, String time, double price) {
		this.show = show; 
		this.time = time; 
		this.price = 11;
	}

	public Tickets() {
		
	}

	public Show getShow() {
		return show;
	}

	public String getTime() {
		return time;
	}

	public double getPrice() {
		return price;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setPrice(double price) {
		if (this.price >= 0.0)
			this.price = price;
	}
	
	public String toString() {
		return "Show: " + this.show + "\n Time: " + this.time + "\n Price: " + this.price + "\n Enjoy your show!";
	}
}
