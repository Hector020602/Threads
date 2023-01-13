public class MyThread extends Thread {

    public String name = "";

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("MyThread: " + name + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
