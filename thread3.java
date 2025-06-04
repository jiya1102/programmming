class downloadfile extends Thread {
    String fileName;

    public downloadfile(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(fileName + " " + "downloading...." + (i * 20) + "%");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.err.println(fileName + " " + "done");
    }
}

public class thread3 {
    public static void main(String[] args) {
        downloadfile t1 = new downloadfile("A");
        downloadfile t2 = new downloadfile("B");
        t1.start();
        t2.start();

    }
}
