import java.util.LinkedList;

public class linked_list2 {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            if (i >= 101 && i <= 200) {
                arr.add(i);

            }
            // arr.add(i);
        }
        System.out.println(arr);
    }
}
