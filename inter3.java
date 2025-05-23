interface walkable {
    void walk();

}

interface runable {
    void run();

}

class Human implements walkable, runable {
    public void walk() {
        System.out.println("human can walk");
    }

    public void run() {
        System.out.println("human can run");
    }

}

public class inter3 {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.walk();
        obj.run();
    }
}
