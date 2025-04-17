
import java.util.Scanner;

public class arrayintput {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter arr values");
        int[]arr=new int [n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();

        }
        
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
        }
        System.out.println(sum);
        //System.out.print(arr[j]);

    }
}
