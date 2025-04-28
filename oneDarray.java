public class oneDarray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 4, 5, 6 } };
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total = total + arr[i].length;

            }
            int[] arr1 = new int[total];
            System.out.println(arr.length);

        }
        for (int k = 0; k < total; k++) {
            System.out.print(total);

        }

    }
}
