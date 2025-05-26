import java.util.*;

public class arrlist2 {
    public static void main(String[] args) {
        // int[] arr={-4,6,0,-7,3,4,-8};
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("-4");
        arr1.add("6");
        arr1.add("0");
        arr1.add("-7");
        arr1.add("3");
        arr1.add("4");
        arr1.add("-8");
        Collections.sort(arr1);
        System.out.println(arr1);

    }
}
