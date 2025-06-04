import java.nio.file.WatchEvent;

public class thread6 {
    public static void main(String[] args) {
        WithdrawThread t1 = new WithdrawThread(800);
        WithdrawThread t2 = new WithdrawThread(500);
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        t2.start();
    }
}

class WithdrawThread extends Thread {
    static int totalBalance = 1000;
    int amount;

    public WithdrawThread(int amount) {
        this.amount = amount;
    }

    public void run() {
        synchronized (WithdrawThread.class) {
            if (totalBalance >= amount) {
                System.out.println("withdrawl succesful" + amount);

                totalBalance = totalBalance - amount;
                System.out.println(totalBalance);
            } else {
                System.out.println("insufficiant balance");
            }
        }
    }
}
