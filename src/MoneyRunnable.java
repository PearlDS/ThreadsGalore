public class MoneyRunnable implements Runnable{

    private BankAccount bankAccount;
    private int moneyAmount;
    private int amountOfTransactionDays;

    public MoneyRunnable(BankAccount bankAccount, int moneyAmount, int amountOfTransactionDays) {
        this.bankAccount = bankAccount;
        this.moneyAmount = moneyAmount;
        this.amountOfTransactionDays = amountOfTransactionDays;
    }

    @Override
    public void run() {
        for (int i = 0; i<amountOfTransactionDays; i++) {
            if (moneyAmount > 0) {
                bankAccount.addMoney(moneyAmount);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else bankAccount.getBroke(-moneyAmount);
        }

    }
}
