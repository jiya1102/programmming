public class newstr {
    public static void main(String[] args) {
        // String str ="hello";
        // String str =newstring("hello");
        String str = "sheezal";
        String newstr = " ";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (newstr.indexOf(c) == -1) {
                newstr += c;
            }
        }
        System.out.println(newstr);

    }
}
