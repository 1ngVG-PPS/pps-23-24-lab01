package example.model;

/**
 * This class represent a particular instance of a BankAccount.
 * In particular, a Simple Bank Account allows always the deposit
 * while the withdrawal is allowed only if the balance greater or equal the withdrawal amount
 */
public class SimpleBankAccount implements BankAccount {

    protected double balance;
    private final AccountHolder holder;
    private double fee;
  

    public SimpleBankAccount(final AccountHolder holder, final double balance) {
        this.holder = holder;
        this.balance = balance;
        fee = 0;

    }
    @Override
    public AccountHolder getHolder(){
        return this.holder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(final int userID, final double amount) {
        if (checkUser(userID) && isDepositAllowed(amount)) {
            this.balance += amount;
            applyFee(userID);
        }
    }

    @Override
    public void withdraw(final int userID, final double amount) {
        if (checkUser(userID) && isWithdrawAllowed(amount)) {
            this.balance -= amount;
            applyFee(userID);
        }
    }
    
    
    public void applyFee(final int userID){
        if (checkUser(userID)) {
            this.balance -= fee ;
        }
    }

    private boolean isWithdrawAllowed(final double amount){
        return (this.balance >= (amount + fee)&& amount >0);
    }
    private boolean isDepositAllowed(final double amount){
        return (amount > fee&& amount >0);
    }

    protected boolean checkUser(final int id) {
        return this.holder.getId() == id;
    }
    
}
