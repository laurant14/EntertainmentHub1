import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketsTesting {
	static Tickets ticket;
	static Show show;
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		ticket = new Tickets("Frozen 2", "10 PM", 11.0, 1, 1);
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	void newTicketsRow() {
		ticket.setRow(2);
		assertEquals(2, ticket.getRow());
	}
	@Test
	void newTicketsName() {
		ticket.setName("Coco");
		assertEquals("Coco", ticket.getName());
	}
	@Test
	void newTicketsColumn() {
		ticket.setColumn(2);
		assertEquals(2, ticket.getColumn());
	}
	@Test
	void newTicketsShow() {
		show = new Show("Movie", "Coco", "12 PM", "7 PM", "\"best movie ever\n", "*****");
		ticket.setShow(show);
		assertEquals(show, ticket.getShow());
	}
	@Test
	void newTicketsPrice() {
		ticket.setPrice(11);
		assertEquals(11, ticket.getPrice());
	}
	@Test
	void newTicketsTime() {
		ticket.setTime("11 am");
		assertEquals("11 am", ticket.getTime());
	}
	
	@Test
	void ticketsToString() {
		String tickets=ticket.toString();
		assertEquals("Show: " + ticket.getShow() + "\n Time: " + ticket.getTime() + "\n Price: " + ticket.getPrice() + "\n Enjoy your show!", tickets);
	}

}
