import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdminAccountTest {
	static AdminAccount adAcct;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		adAcct=new AdminAccount("Laura", "laurant", "pass", AccountType.Student);
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
	void adminAddShow() {//how do i access the showlist thats being modified
		adAcct.addShow("Movie", "Frozen 2", "11 PM", "10 AM", "The best Frozen yet","****");
		assertEquals(5, DataLoader.SHOWLIST.length());
	}
	
	@Test
	void adminRemoveShow() {//same issue as above
		adAcct.removeShow("Frozen");
		assertEquals(4, DataLoader.SHOWLIST.length());
	}
}
