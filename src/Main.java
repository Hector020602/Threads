import javax.print.attribute.standard.RequestingUserName;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyThread thread = new MyThread();
        Runnable r = new MyThread2();
        Thread thread2 = new Thread(r);
        thread.name = "Hector";
        thread.start();
        thread2.start();
        for (int i = 0; i < 10000; i++) {
            if (i == 1000) {
                thread.name = "Susana";
            }
            System.out.println("Main: " + i);
            Thread.sleep(1000);
        }

    }
}
