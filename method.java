public class method {
    // static void sum(int a) {
    // System.out.println(a);
    static int sum(int a, int b) {

        return a + b;

    }

    public static void main(String[] args) {
        method obj = new method();
        int res = obj.sum(2, 7);
        System.out.println(res);
        // sum(5);

    }
}
