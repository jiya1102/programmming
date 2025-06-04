class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + "insan");
    }
}

public class thread4 {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("hello");
    }
}
