import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("astha");
        arr.add("sheezal");
        arr.add("mata shri");
        arr.add(1, "jay");
        arr.add("mani");
        arr.set(0, "jiya");
        arr.remove(4);
        // arr.clear();

        System.out.println(arr);
    }

}
