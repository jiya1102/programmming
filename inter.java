interface client {
    void print();

    void show();

}

class dev implements client {
    public void print() {
        System.out.println("print the paper");
    }

    public void show() {
        System.out.println("print the menu");
    }
}

public class inter {
    public static void main(String[] args) {
        dev obj = new dev();
        obj.print();
        obj.show();
    }
}
