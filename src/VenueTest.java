import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VenueTest {
	static Venue ven;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ven=new Venue();
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
	void testSetTitle() {
		ven.setTitle("Frozen");
		assertEquals("Frozen", ven.getTitle());
	}
	
	@Test
	void testSetPrice() {
		ven.setPrice(8.9);
		assertEquals(8.9, ven.getPrice());
	}
	
	@Test
	void testSetDescription() {
		ven.setDescription("This is the best movie ever");
		assertEquals("This is the best movie ever", ven.getDescription());
		
	}
	
	@Test
	void testSetName() {
		ven.setName("Jungle Book");
		assertEquals("Jungle Book", ven.getName());
	}
	
	@Test
	void testSetLocation() {
		ven.setLocation("Columbia");
		assertEquals("Columbia", ven.getLocation());
	}
	
	@Test
	void venToString() {
		String venue=ven.toString();
		assertEquals("Name: " +ven.getName() + "\nLocation: " + ven.getLocation(), venue);
	}

}
