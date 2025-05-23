interface client1 {
    void show();
}

interface client2 {
    void print();

}

class devlp implements client1, client2 {
    public void show() {
        System.out.println("this is common feature for client1&&client2");
    }

    public void print() {
        System.out.println("this is ");
    }
}

public class inter2 {

    public static void main(String[] args) {
        devlp obj = new devlp();
        obj.show();
        obj.print();
    }
}
