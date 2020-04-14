import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegularAccountTest {
	static RegularAccount regAcct;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		regAcct=new RegularAccount("Laura", "laurant", "pass", AccountType.Student);
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
	void creatingADiscountStudent() {
		Tickets tick=new Tickets("Frozen", "11PM", 11.0, 4, 8);
		Account account=new Account();
		account.setAccountType(AccountType.Student);
		regAcct.createDiscount(tick);
		assertEquals(9.9, tick.getPrice());
	}
	
	@Test
	void creatingADiscountAdult() {
		Tickets tick=new Tickets("Frozen", "11PM", 11.0, 4, 8);
		Account account=new Account();
		account.setAccountType(AccountType.Adult);
		regAcct.createDiscount(tick);
		assertEquals(11.0, tick.getPrice());
	}
	
	@Test
	void creatingADiscountTeacher() {
		Tickets tick=new Tickets("Frozen", "11PM", 11.0, 4, 8);
		Account account=new Account();
		account.setAccountType(AccountType.Teacher);
		regAcct.createDiscount(tick);
		assertEquals(8.8, tick.getPrice());
	}
	
	@Test
	void creatingADiscountSenior() {
		Tickets tick=new Tickets("Frozen", "11PM", 11.0, 4, 8);
		Account account=new Account();
		account.setAccountType(AccountType.Senior);
		regAcct.createDiscount(tick);
		assertEquals(9.9, tick.getPrice());
	}
	
	@Test
	void creatingADiscountGuest() {
		Tickets tick=new Tickets("Frozen", "11PM", 11.0, 4, 8);
		Account account=new Account();
		account.setAccountType(AccountType.Guest);
		regAcct.createDiscount(tick);
		assertEquals(11.0, tick.getPrice());
	}
	
	@Test
	void creatingADiscountVeteran() {
		Tickets tick=new Tickets("Frozen", "11PM", 11.0, 4, 8);
		Account account=new Account();
		account.setAccountType(AccountType.Veteran);
		regAcct.createDiscount(tick);
		assertEquals(9.35, tick.getPrice());
	}

}
