public class decimaltobinary {
    public static void decimalno(int n){

        int pow=0;

        int bina =0;
        while(n>0){
            int rem = n%2;
            bina= bina + (rem *  ( int)Math.pow(10,pow));
            pow++;
            n= n/2;
        }
        System.out.println(bina);
    }
    public static void main(String[] args) {
        decimalno(5);
    }
}
