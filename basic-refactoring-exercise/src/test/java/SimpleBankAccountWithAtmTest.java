import example.model.AccountHolder;
import example.model.BankAccount;
//import example.model.SimpleBankAccount;
import example.model.SimpleBankAccountWithAtm;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountWithAtmTest {

    private AccountHolder accountHolder;
    private BankAccount bankAccount;

    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);
    }

    @Test
    void testWrongDeposit2() {
        bankAccount.deposit(accountHolder.getId(), 1);
        bankAccount.deposit(2, 50);

        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    void testWrongWithdraw2() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdraw(accountHolder.getId(), 100);
        
        assertEquals(99, bankAccount.getBalance());
    }
    
}

    

