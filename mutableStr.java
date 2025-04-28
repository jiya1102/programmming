public class mutableStr {
    public static void main(String[] args) {
        // imutable string
        // String str = "hello";
        // System.out.println(str.concat("hiii"));
        // System.out.println(str);

        // mutable string

        // StringBuilder str = new StringBuilder("hello");
        // str.append("hii");
        // System.out.println(str);

        // length and capacity of string

        StringBuilder str = new StringBuilder(10);
        str.append("hii");
        System.out.println(str.length());

    }
}
