public class BankAccount {

    private int moneyAmountInMyAccount = 0;


    public synchronized void addMoney(int money){
            moneyAmountInMyAccount += money;
            notify();

    }

    public synchronized void getBroke(int money){
        if(moneyAmountInMyAccount<300) {
            try {
                System.out.println("Not above the 300!!! Money in the bank: "+moneyAmountInMyAccount);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            moneyAmountInMyAccount -= money;
        notifyAll();

    }

    public int getMoneyAmountInMyAccount() {
        return moneyAmountInMyAccount;
    }
}
