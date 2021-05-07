import java.util.Timer;

public class BankSimulationApp {
    public static void main(String[] args) {

//        BankAccount account = new BankAccount();
//        Thread gettingPaid = new Thread(new MoneyRunnable(account, 40, 100000));
//        Thread gettingBroke = new Thread(new MoneyRunnable(account, -7, 100000));
//
//
//
//        gettingPaid.start();
//        gettingBroke.start();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(account.getMoneyAmountInMyAccount());


        Timer timer = new Timer();
        timer.schedule(new ReminderToTakeTrashOut(),3000);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();



    }
}
