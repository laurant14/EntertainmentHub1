import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConcertsTesting {
	static Concerts concert;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		concert = new Concerts("the weeknd", "7 PM", "9 PM", "dark hip hop", "*****");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void newConcertList() {
		concert.getConcertList();
		assertEquals(1, Concerts.concerts.size());
	}
	
	@Test
	void concertToString() {
		String conc=concert.toString();
		assertEquals("Name: " +concert.getName() + "\nTime 1: " +concert.gettime1() + "\nTime 2: " + concert.gettime2() + "\nDescription: " +concert.getDescription() + "\nRating: " +concert.getReviews() + "\n", conc);
	}

}