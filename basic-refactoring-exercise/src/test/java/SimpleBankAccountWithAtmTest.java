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
    void testInitialBalance() {
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.applyFee(accountHolder.getId());
        assertEquals(99, bankAccount.getBalance());
    }
   

    @Test
    void testWrongDeposit() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.applyFee(accountHolder.getId());
        bankAccount.deposit(2, 50);
        bankAccount.applyFee(accountHolder.getId());
        assertEquals(99, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.applyFee(accountHolder.getId());
        bankAccount.withdraw(accountHolder.getId(), 70);
        bankAccount.applyFee(accountHolder.getId());
        assertEquals(28, bankAccount.getBalance());
    }

    @Test
    void testWrongWithdraw() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.applyFee(accountHolder.getId());
        bankAccount.withdraw(2, 70);
        bankAccount.applyFee(2);
        assertEquals(99, bankAccount.getBalance());
    }
}

    

