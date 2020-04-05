import java.util.ArrayList;
import java.util.Random;

public class Show {

	Venue venue;
	//private String type;
	private String name;
	private String time1;
	private String time2;
	private String description;
	private String ratings;
	private char seats[][]=new char[11][11];
	private Event event;
	private String showType;

	public Show(String showType, String name, String time1, String time2, String description,String ratings) {
		this.showType=showType;
		this.name=name;
		this.time1=time1;
		this.time2=time2;
		this.description=description;
		this.ratings=ratings;

	}
	public Show() {

	}
	public Show(String username, int stars, String comment) {
		// TODO Auto-generated constructor stub
	}

	ArrayList<Show> shows = new ArrayList<Show>();

	public String getshowType() {
		return this.showType;
	}
	public void setshowType(String type) {
		this.showType = type;
	}

	public String getName() {
		return this.name;
	}
	public void setShowName(String name) {
		this.name = name;
	}
	public String gettime1() {
		return this.time1;
	}

	public void settime1(String time1) {
		this.time1 = time1;
	}

	public String gettime2() {
		return this.time2;
	}

	public void settime2(String time2) {
		this.time2 = time2;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRating(){
		return this.ratings;
	}

	public void setRatings(String ratings){
		this.ratings = ratings;
	}




	public void initSeats() {
		Random r=new Random();
		for(int i = 0; i < seats.length; i++) {
			for(int j=0;j < seats[i].length;j++) {
				seats[i][j]='X';
			}
		}
		for(int i = 0; i < 10; i++) {
			for(int j=0;j<seats[i].length;j++) {
				seats[r.nextInt(10)][r.nextInt(10)]='-';
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<1;j++) {
				seats[i][j]='H';
			}
		}
		for(int i=0;i<5;i++) {
			for(int j=9;j<10;j++) {
				seats[i][j]='H';
			}
		}

		/*for(int i = 0; i < seats.length; i++) {
			for(int j=0;j<seats[i].length;j++) {
				System.out.print(seats[i][j]);
			}
			System.out.println();
		}*/
	}

	public void printChart() {
		initSeats();
		System.out.print("      ");
		for(int i=0;i<seats.length;i++) {
			System.out.print(i);
		}
		System.out.println();
		for(int i = 0; i < seats.length; i++) {
			System.out.print("Row " + i + "  ");
			for(int j=0;j<seats[i].length;j++) {
				System.out.print(seats[i][j]);
			}
			System.out.println();
		}
	}
	public int getSeats() {
		int count = 0;
		for(int i = 0; i < seats.length; i++) {
			for(int j=0;j<seats.length;j++) {
				System.out.print(seats[i][j]);
			}
		}
		return count;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setSeats(char seats[][]) {
		this.seats = seats;
	}
	public String getVenue() {
		return "Venue: " +venue.printVenue();
	}

	//to add show from admin account
	public static void add(Show show) {
		// TODO Auto-generated method stub

	}

}
