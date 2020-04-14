import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayTesting {
	static Play play;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		play = new Play("Wicked", "1 PM", "7 PM", "Retelling, from the witch's perspective, of the Wizard of Oz.", "****");
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
	void newPlayList() {
		play.getPlayList();
		assertEquals(1, Play.plays.size());
	}
	
	@Test
	void playToString() {
		String pl=play.toString();
		assertEquals("Name: " +play.getName() + "\nTime 1: " +play.gettime1() + "\nTime 2: " + play.gettime2() + "\nDescription: " +play.getDescription() + "\nRating: " +play.getReviews() + "\n", pl);
	}

}
