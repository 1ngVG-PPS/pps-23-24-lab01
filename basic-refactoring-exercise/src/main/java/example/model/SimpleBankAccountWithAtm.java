package example.model;

public class SimpleBankAccountWithAtm extends SimpleBankAccount{

    public SimpleBankAccountWithAtm(AccountHolder holder, double balance) {
        super(holder, balance);
    }

    private int fee = 1;

    @Override
    public void applyFee(final int userID) {
        if (checkUser(userID)) {
            this.balance -= fee ;
        }

    }
    
}