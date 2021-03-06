/**
 * This class is the structure to allow the creation of a new ticket
 */

import java.io.*;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;

public class Tickets {
	protected Show show;
	protected String time; 
	protected double price;
	protected String name;
	protected int row;
	protected int column;
	
	
	/**
	 * Constructor which creates new ticket using inputed information from the user
	 * @param name-of Movie
	 * @param time-of showing
	 * @param price-of movie
	 * @param row-seat
	 * @param column-seat
	 */
	public Tickets(String name, String time, double price, int row, int column) {
		this.name = name; 
		this.time = time; 
		this.price = 11.0;
		this.row=row;
		this.column=column;
	}
	
	/**
	 * Default constructor which sets each attribute to a default value
	 */
	public Tickets() {
		this.price=11.00;
		this.name=" ";
		this.time=" ";
		this.row=0;
		this.column=0;
	}
	
	/**
	 * This method takes the ticket that was created and writes it to a text document to "print" the ticket
	 * @throws IOException
	 */
	public void writeTicketStub() throws IOException {

		File file = new File("C:\\Users\\Laura\\eclipse-workspace\\EntertainmentHub\\src\\TicketStub.txt");
		
		//Write Content
		FileWriter writer = new FileWriter(file,true);
		writer.write("\nName: "+this.getName() + "\n"
				+ "Time: "+this.getTime()+"\n"
				+ "Seat row: "+this.getRow()+"\n"
				+ "Seat column: "+this.getColumn()+"\n");
		writer.close();
	}

	public String getName() {
		return this.name;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public void setRow(int row) {
		this.row=row;
	}
	
	public int getColumn() {
		return this.column;
	}
	
	public void setColumn(int column) {
		this.column=column;
	}
	
	public void setName(String name) {
		this.name=name;
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
