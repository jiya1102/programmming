public class pallindrome {
    public static void main(String[] args) {
        int a=123;
        int oringinal = a;
        int res = 0;
        while(a>0){
            int digit = a%10;
            res = res*10+digit;
            a=a/10;
        }
        if(oringinal==res){
            System.out.println("p");
        }
        else{
            System.out.println("n");
        }
    }
}
