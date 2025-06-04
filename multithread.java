//creat multithread using inheritence
class MyThread extends Thread {
    public void run() {// predefine run method
        System.out.println("hello");
    }
}

public class multithread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();// call to run method
        System.out.println("hiii");
    }
}
