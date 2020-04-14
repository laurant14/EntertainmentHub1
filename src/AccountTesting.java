import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTesting {
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
	void setAccountTypeAdult() {
		acct.setAccountType(AccountType.Adult);
		assertEquals(AccountType.Adult, acct.getAccountType());
	}
	
	@Test
	void setAccountTypeSenior() {
		acct.setAccountType(AccountType.Senior);
		assertEquals(AccountType.Senior, acct.getAccountType());
	}
	
	@Test
	void setAccountTypeVeteran() {
		acct.setAccountType(AccountType.Veteran);
		assertEquals(AccountType.Veteran, acct.getAccountType());
	}
	
	@Test
	void setAccountTypeStudent() {
		acct.setAccountType(AccountType.Student);
		assertEquals(AccountType.Student, acct.getAccountType());
	}
	
	@Test
	void setAccountTypeTeacher() {
		acct.setAccountType(AccountType.Teacher);
		assertEquals(AccountType.Teacher, acct.getAccountType());
	}
	
	@Test
	void setAccountTypeGuest() {
		acct.setAccountType(AccountType.Guest);
		assertEquals(AccountType.Guest, acct.getAccountType());
	}
	
	@Test
	void newAccountsetDiscount() {
		acct.setDiscount(.10);
		assertEquals(0.10, acct.getDiscount());
	}
	
	@Test
	void accountAddAccount() {//should the size be 2? or 1?
		acct.addAccount("laura trombetta", "myUsername", "myPass",AccountType.Senior);
		assertEquals(1, acct.accounts.size());
	}
	
	
	@Test
	void locateAccountLogin() {
		boolean result=acct.loginAccount("myUsername", "myPass");
		assertEquals(true, result);
	}
	
	@Test
	void accountRemoveAccount() {
		acct.deleteAccount("myUsername", "myPass");
		assertEquals(0, acct.accounts.size());
	}
	
	@Test
	void addPaymentCardType() {
		acct.addPayment("MasterCard","Laura", 4564, 546, 12.23);
		assertEquals("MasterCard", acct.cardType);
	}
	
	@Test
	void addPaymentName() {
		acct.addPayment("MasterCard","Laura", 4564, 546, 12.23);
		assertEquals("Laura", acct.getName());
	}
	
	@Test
	void addPaymentCardNum() {
		acct.addPayment("MasterCard","Laura", 4564, 546, 12.23);
		assertEquals(4564, acct.cardNum);
	}
	
	@Test
	void addPaymentPin() {
		acct.addPayment("MasterCard","Laura", 4564, 546, 12.23);
		assertEquals(546, acct.pin);
	}
	
	@Test
	void addPaymentCardExpDate() {
		acct.addPayment("MasterCard","Laura", 4564, 546, 12.23);
		assertEquals(12.23, acct.expDate);
	}
	
	

}
