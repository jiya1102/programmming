interface A {
    void display();

}

interface B {
    void display();
}

class demo implements A, B {
    public void display() {
        System.out.println("this is common for both interface");
    }

}

public class inter4 {

    public static void main(String[] args) {
        demo demo = new demo();
        demo.display();
    }
}
