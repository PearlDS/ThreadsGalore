public class CustomRunnable implements Runnable{

    private String sign;
    private int timesItWillRun;


    public CustomRunnable(String sign) {
        this.sign = sign;
    }

    public CustomRunnable(String sign, int timesItWillRun) {
        this.sign = sign;
        this.timesItWillRun = timesItWillRun;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public void run() {
       for (int i = 0; i<timesItWillRun; i++){
           System.out.println(i+".) "+sign);
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               System.out.println(sign+ " got woke");
           }
       }

    }
}
