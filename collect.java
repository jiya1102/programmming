import java.util.*;
//import java.util.Collections;

public class collect {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("A");
        arr.add("C");
        arr.add("b");
        Collections.sort(arr);
        System.out.println(arr);

    }
}
