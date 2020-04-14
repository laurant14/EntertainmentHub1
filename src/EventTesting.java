import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EventTesting {
	static Event event;
	static Reviews reviews;
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		event = new Event("Movie", "Frozen 2", "12 PM", "7 PM", "\"A sister saves another sister from a terrible fate.\n", "*****");
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
	void newEventName() {
		event.setName("Aladdin");
		assertEquals("Aladdin", event.getName());
	}
	@Test
	void newEventDescription() {
		event.setDescription("a poor boy falls in love with a princess, doesn't think he has a chance till he finds a GENIE!");
		assertEquals("a poor boy falls in love with a princess, doesn't think he has a chance till he finds a GENIE!", event.getDescription());
	}
	@Test
	void newEventReview() {
		reviews = new Reviews("laurant", 5, "a classic!");
		event.setReviews("Aladdin", reviews);
		assertEquals("Aladdin", reviews, event.getReviews());
	}
}