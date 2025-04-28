public class maximum {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 6 }, { 3, 4, 5, 6, 7 } };
        int max[][] = new int[][];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (max[i][j] < arr.length) {
                    max = arr[i][j];
                }
                // System.out.println(sum);
            }
            // System.out.println("sum is" + sum);
        }

    }
}
