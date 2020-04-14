import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TheaterTesting {
	static Theater theater;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		theater = new Theater("laurant", 5, "good theater");
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
	void newGetShows() {
		theater.getShows("Frozen 2");
		assertEquals("Frozen 2", theater.getShows());
	}
	

}
