public class resString {
    public static void main(String[] args) {
        String str = "eyi";
        String oringal = str;

        for (int i = str.length() - 1; i >= 0; i--) {
            oringal += str.charAt(i);

        }
        System.out.println(oringal);
        if (str.equals(str)) {
            System.out.println("p");
        } else {
            System.out.println("n");
        }

    }
}
