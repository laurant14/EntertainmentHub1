import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitTesting {
	static Account acct;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		acct=new Account("Laura", "laurant", "pass", AccountType.Student);
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
	void newAccountsetName() {
		acct.setName("Sarayu");
		assertEquals("Sarayu", acct.getName());
	}
	
	@Test
	void newAccountsetUsername() {
		acct.setUsername("sarayudas");
		assertEquals("sarayudas", acct.getUsername());
	}
	
	@Test
	void newAccountsetPassword() {
		acct.setPassword("password");
		assertEquals("password", acct.getPassword());
	}
	
	@Test
	void newAccountsetDiscount() {
		acct.setDiscount(.10);
		assertEquals(0.10, acct.getDiscount());
	}
	
	/*@Test
	void accountAddPayment() {
		acct.addPayment("MasterCard", "Laura Trombetta", 45454,457, 12.23);
		//assertEquals();
	}*/
	
	

}
