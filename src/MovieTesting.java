import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieTesting {
	static Movie movie;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		movie = new Movie("Frozen 2", "12 PM", "7 PM", "\"A sister saves another sister from a terrible fate.\n", "*****");
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
	void newMovieList() {
		movie.getMovieList();
		assertEquals(2, Movie.movies.size());
	}
	
	@Test
	void movieToString() {
		String mov=movie.toString();
		assertEquals("Name: " +movie.getName() + "\nTime 1: " +movie.gettime1() + "\nTime 2: " + movie.gettime2() + "\nDescription: " +movie.getDescription() + "\nRating: " +movie.getReviews() + "\n", mov);
	}

}
