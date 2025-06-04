class MyThread extends Thread {
    public void run() {// predefine run method
        System.out.println("hello");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {

            // TODO: handle exception
        }
        System.out.println("hiiii");
    }
}

public class multithread2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();// call to run method
        System.out.println("hiii");
    }
}
