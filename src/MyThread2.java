public class MyThread2 implements Runnable {

    public String name = "";

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("MyThread2 " + name + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


