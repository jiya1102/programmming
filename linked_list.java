import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(4);
        arr.add(5);
        arr.add(0, 3);
        arr.set(1, 2);
        arr.remove(2);
        // System.out.println(arr.contains(4));
        System.out.println(arr);
    }
}
