import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShowTesting {
	static Show show;
	static Venue venue;
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		show = new Show("Movie", "Frozen 2", "12 PM", "7 PM", "\"A sister saves another sister from a terrible fate.\n", "*****");
		venue=new Venue();
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
	void newShowType() {
		show.setshowType("Movie");
		assertEquals("movie", show.getshowType());
	}
	@Test
	void newShowName() {
		show.setShowName("Lion King");
		assertEquals("Lion King", show.getName());
	}
	@Test
	void newShowTime1() {
		show.settime1("1 PM");
		assertEquals("1 PM", show.gettime1());
	}
	@Test
	void newShowTime2() {
		show.settime2("10 PM");
		assertEquals("10 PM", show.gettime2());
	}
	@Test
	void newDescription() {
		show.setDescription("a young prince's journey to take back the throne from his evil uncle");
		assertEquals("a young prince's journey to take back the throne from his evil uncle", show.getDescription());
	}
	@Test
	void newRating() {
		show.setRatings("*****");
		assertEquals("*****", show.getRating());
	}
	
	
}
