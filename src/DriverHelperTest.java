/*import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DriverHelperTest {
	static DriverHelper DH;
	static Account account;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		DH=new DriverHelper();
		account=new Account("Laura", "userName", "pass", AccountType.Adult);
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
	void testLogIn() {
		Account acct=DH.logIn(account);
		assertEquals(account, acct);
	}
	
	@Test
	void testCreateAccount() {
		Account acct = DH.createAccount(account);
		assertEquals(account, acct);
	}
	
	@Test
	void testGetAccountType() {
		AccountType acctType=DH.getAccountType("senior");
		assertEquals(AccountType.Senior, acctType);
	}

}*/
