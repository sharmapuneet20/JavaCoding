public class printrevofnum {
    public static void main(String[] args) {
        int n= 20112003;
        while(n>0){
            int last_digit = n%10;
            System.out.print(last_digit);
            n/=10;


        }
        System.out.println();
    }
}
