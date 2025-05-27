import java.util.ArrayList;

public class arrlist3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("i");
        arr.add("j");
        arr.add("k");
        arr.set(1, "m");
        arr.add(0, "n");
        // arr.remove(0);
        // arr.clear();
        System.out.println(arr);
    }
}
