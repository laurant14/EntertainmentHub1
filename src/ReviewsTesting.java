import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReviewsTesting {
	static Reviews review;
	static Account account;
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		review = new Reviews ("laurant", 4, "good movie");
		account=new Account();
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
	void newReviewsStars() {
		review.setStars(4);
		assertEquals(4, review.getStars());
	}
	@Test
	void newReviewsComment() {
		review.setComment("aye this was nice!");
		assertEquals("aye this was nice!", review.getComment());
	}
	
	@Test
	void reviewToString() {
		String rev=review.toString();
		assertEquals("Username: " + account.getUsername() + "\nStars: " + review.getStars() + "\nComment: " +review.getComment(), rev);
	}

}
