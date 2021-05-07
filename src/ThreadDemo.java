public class ThreadDemo {

    public static void main(String[] args) {
        try {
            Thread customThread = new Thread(new CustomRunnable("+", 10));
            Thread customThread2 = new Thread(new CustomRunnable("-", 10));
            Thread customThread3 = new Thread(new CustomRunnable("*", 10));


            customThread.start();
            customThread2.start();
            customThread3.start();


            Thread.sleep(300);
            customThread2.interrupt();
            System.out.println(customThread.getState());
            System.out.println(customThread2.getState());
            System.out.println(customThread3.getState());
            Thread.sleep(300);
            customThread2.interrupt();
            Thread.sleep(300);
            customThread2.interrupt();
            Thread.sleep(300);
            customThread2.interrupt();



            Thread scanFile = new Thread(new CustomRunnable("+", 10));
            Thread sendFile = new Thread(new CustomRunnable("-", 10));
            Thread cleanUpCacheOfScanner = new Thread(new CustomRunnable("*", 10));


            scanFile.start();
            scanFile.join(4000);

            sendFile.start();
            sendFile.join();
            cleanUpCacheOfScanner.start();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
