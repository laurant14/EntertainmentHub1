import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class DriverHelper {
	
	Scanner key=new Scanner(System.in);
	
	EntertainmentHub entHub=new EntertainmentHub();

	public Account logIn(Account account) {
		AdminAccount aa=new AdminAccount();
		System.out.println("1) Login or 2) Continue as guest or 3) Admin");
		int answer=key.nextInt();
		switch(answer) {
		case 1:
			System.out.println("Enter your username: ");
			String username=key.next();
			System.out.println("Enter your password: ");
			String password=key.next();
			account.loginAccount(username, password);
			System.out.println("Logging in...\nWhat would you like to do next?");//check to make sure checking for account
			break;
		case 2:
			System.out.println("Continuing as guest...");
			break;
		case 3:
			System.out.println("1) Add show\n2)Remove show");
			int ans=key.nextInt();
			key.nextLine();
			if(ans==1) {
				System.out.println("Enter show type: ");
				String type=key.nextLine();
				System.out.println("Enter show name: ");
				String name=key.nextLine();
				System.out.println("Enter time 1: ");
				String t1=key.nextLine();
				System.out.println("Enter time 2: ");
				String t2=key.nextLine();
				System.out.println("Enter description: ");
				String description=key.nextLine();
				System.out.println("Enter rating in the form of 1-5 stars: ");
				String stars=key.nextLine();
				aa.addShow(type, name, t1, t2, description, stars);
			}
			else if(ans==2) {
				System.out.println("Enter show name to remove: ");
				String remName=key.nextLine();
				//if(remName==show.getName())
				
			}
		}
			
		return account;
	}
	public Account createAccount(Account account) {
		System.out.println("Enter your full name: ");
		String name=key.nextLine();
		System.out.println("Enter a username: ");
		String userName=key.next();
		System.out.println("Enter a password: ");
		String passWord=key.next();
		System.out.println("Enter an account type: Student, Adult, Teacher, Senior, Guest, or Veteran");
		AccountType acctType=getAccountType(key.next());
		System.out.println(acctType);
		account.addAccount(name, userName, passWord, acctType);//make sure its adding it to the arrayList of accounts
		return account;
	}
	
	public AccountType getAccountType(String string) {
		if(string.equalsIgnoreCase("student")) {
			return AccountType.Student;
		}
		else if(string.equalsIgnoreCase("adult")) {
			return AccountType.Adult;
		}
		else if(string.equalsIgnoreCase("teacher")) {
			return AccountType.Teacher;
		}
		else if(string.equalsIgnoreCase("senior")) {
			return AccountType.Senior;
		}
		else if(string.equalsIgnoreCase("guest")) {
			return AccountType.Guest;
		}
		else if(string.equalsIgnoreCase("veteran")) {
			return AccountType.Veteran;
		}
		else {
			return null;
		}
	}
	
	public void buyTickets() throws IOException {
		Account account=new Account();
		Show show=new Show();
		Tickets ticket=new Tickets();
		RegularAccount RA=new RegularAccount();
		System.out.println("Do you want to buy tickets for a 1) play, 2) movie, or 3) concert?");
		int selection=key.nextInt();
		key.nextLine();
		System.out.println("Select one of the following: ");
		if(selection==1) {
			entHub.getPlays();
		}
		else if(selection==2) {
			entHub.getMovies();
		}
		else if(selection==3) {
			entHub.getConcerts();
		}
		else {
			System.out.println(selection + " wasn't an option");
		}
		System.out.println("Enter show choice: ");
		String showChoice=key.nextLine();
		System.out.println("Enter time choice: ");
		String timeChoice=key.nextLine();
		System.out.println("'X' means seat is available. '-' is a taken seat.\n"
				+ "Availibility for your show is: ");
		show.printChart();
		System.out.println();
		System.out.println("How many tickets would you like to purchase?");
		int purchNum=key.nextInt();
		key.nextLine();
		System.out.println("Your price comes out to: " + (ticket.getPrice()*purchNum));//fix later
		System.out.println("Entering payment...\n"
				+ "Enter your card type:");
		String cardType=key.nextLine();
		System.out.println("Enter the name displayed on your card: ");
		String name=key.nextLine();
		System.out.println("Enter your card number: ");
		int cardNum=key.nextInt();
		key.nextLine();
		System.out.println("Enter the PIN on the back of your card: ");
		int pin=key.nextInt();
		key.nextLine();
		System.out.println("Enter the card's expiration date in the form of Month.Year (ex: 10.23): ");
		double expDate=key.nextDouble();
		key.nextLine();
		account.addPayment(cardType, name, cardNum, pin, expDate);
		
		Tickets[] ticketsArr=new Tickets[purchNum];
		int rowNum=0;
		int colNum=0;
		File file=new File("C:\\Users\\Laura\\eclipse-workspace\\EntertainmentHub\\src\\TicketStub.txt");
		FileWriter eraser=new FileWriter(file);
		eraser.write("");
		for(int i=0;i<purchNum;i++) {
			Tickets newTicket=new Tickets();
			newTicket.setName(showChoice);
			newTicket.setTime(timeChoice);
			System.out.println("Pick your seat by row number: ");
			rowNum=key.nextInt();
			newTicket.setRow(rowNum);
			key.nextLine();
			System.out.println("Pick your seat by column number: ");
			colNum=key.nextInt();
			key.nextLine();
			newTicket.setColumn(colNum);
			key.nextLine();
			ticketsArr[i]=newTicket;
			newTicket.writeTicketStub();
			}
		
		System.out.println("Enter your account type: Student, Adult, Teacher, Senior, Guest, or Veteran");
		AccountType acctType=getAccountType(key.next());
		RA.account.setAccountType(acctType);
		RA.createDiscount(ticketsArr[0]);
		System.out.println("Your new price is: $" +ticketsArr[0].getPrice());
		//have option to print tickets
		
		System.out.println("Payment was successful!"
				+ "\nPrinting your ticket...\n");
		
		
		
	}
	
	//pick a seat method
	//pick a row/column
	
	public void view() {
		System.out.println("Would you like to view 1) movies, 2) plays, or 3) concerts?");
		int Choice=key.nextInt();
		if(Choice==1) {
			entHub.getMovies();
			//somehow be able to go back 
		}
		else if(Choice==2) {
			entHub.getPlays();
			//somehow be able to go back to options
		}
		else if(Choice==3) {
			entHub.getConcerts();
			//go back to options
		}
		else {
			System.out.println(Choice + " wasn't one of the above options!");
		}
	}
	

	public void writeReview() {
		Event event=new Event();//fix later
		System.out.println("Which show would you like to review?");
		String rev=key.nextLine();
		//figure out how to link show to review
		event.setName(rev);
		System.out.println("Enter Username: ");
		String userName1=key.nextLine();
		System.out.println("Enter stars from 1-5: ");
		int stars=key.nextInt();
		key.nextLine();
		//System.out.println("Line 126");
		System.out.println("Enter comment: ");
		String comment=key.nextLine();
		//System.out.println("Line 129");
		Reviews rev1=new Reviews(userName1, stars, comment);
		//System.out.println("Line 131");
		event.setReviews(event.getName(), rev1);
		//System.out.println("I'm here");
		System.out.println(rev1);
		
	}
	
	public void displayMainMenu() {
		System.out.println("What would you like to do?\n"
				+ "1) Create Account\n"
				+ "2) Buy Ticket\n"
				+ "3) Browse Shows\n"
				+ "4) Write a Review\n"
				+ "5) Quit");
	}
	
	
	
	public void runSim() throws IOException {
		Account account=new Account();
		//while loop to keep running
		logIn(account);
		while(true) {
			displayMainMenu();
			int choice=key.nextInt();
			key.nextLine();
			switch(choice) {
			case 1:
				account=createAccount(account);
				break;
			case 2:
				buyTickets();
				break;
			case 3:
				view();
				break;
			case 4:
				writeReview();
				break;
			case 5:
				System.out.println("Goodbye!");
				return;
			default:
				System.out.println("Invalid input, enter a number from 1-6!");
			}
			
		}
	}

}
