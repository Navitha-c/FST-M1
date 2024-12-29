package Session1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ActivityTest2 {

    @Test
    public void notEnoughFunds() {
        // Create an object of BankAccount and set balance to 10
        BankAccount account = new BankAccount(10);

        // Assert that withdrawing 20 throws NotEnoughFundsException
        assertThrows(NotEnoughFundsException.class, () -> {
            account.withdraw(20);
        });
    }

    @Test
    public void enoughFunds() {
        // Create an object of BankAccount and set balance to 100
        BankAccount account = new BankAccount(100);

        // Assert that withdrawing 50 does NOT throw NotEnoughFundsException
        assertDoesNotThrow(() -> {
            account.withdraw(50);
        });
    }
}
