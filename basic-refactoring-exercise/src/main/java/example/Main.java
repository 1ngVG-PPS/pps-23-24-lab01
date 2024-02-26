package example;

import example.model.AccountHolder;
import example.model.BankAccount;
//import example.model.SimpleBankAccount;
import example.model.SimpleBankAccountWithAtm;

public class Main {

    public static void main(String[] args) {
        final AccountHolder accountHolder = new AccountHolder("Mario", "Rossi", 1);
        final BankAccount bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);

        bankAccount.deposit(accountHolder.getId(), 100);

        System.out.println("Current balance is " + bankAccount.getBalance());

        bankAccount.withdraw(accountHolder.getId(), 30);

        System.out.println("Current balance is " + bankAccount.getBalance());

        bankAccount.withdraw(accountHolder.getId(), 80);

        System.out.println("Current balance is " + bankAccount.getBalance());
    }
}
