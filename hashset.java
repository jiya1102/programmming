import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5, 6, 6, 7 };
        HashSet<Integer> set = new HashSet<>();// if we dont take duplicate value then we use HashSet
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}
