interface Animal {
    void makesound();
}

class dog implements Animal {
    public void makesound() {
        System.out.println("bark");
    }
}

public class inter5 {

    public static void main(String[] args) {
        dog dog = new dog();
        dog.makesound();

    }
}