package Q1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccount1 {

	@Test
	void Withdraw() throws InsufficientFundException {
        assertThrows(InsufficientFundException.class,() -> BankAccount.withdraw(9000));
        assertEquals(6000, BankAccount.withdraw(1000));
        System.out.println(BankAccount.withdraw(1000));
	}

}