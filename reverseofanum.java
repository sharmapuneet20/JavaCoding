public class reverseofanum{

    public static int  multiply(int a , int b){
        int prod = a*b;
        return prod;

    }
    public static int factorial(int n){
        int fact= 1;
        for (int i=1; i<=n; i++){
            fact*=i;

        }
        return fact;

    }


    public static boolean isprime(int n){

        if (n==2){
            return true;
        }

        for (int i=2; i<= Math.sqrt(n); i++){
            if ( n % i==0){
                return false;
            }
        }
        return true;
    }

    public static void rangeinprime(int n ){
        for (int i=2; i<=n; i++){
            if (isprime(i)){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }

    public static void bintodec(int n){
        int dec=0;
        int pow=0;
        while(n>0){
            int last_digit = n%10;
            dec = dec +(last_digit *  ( int)Math.pow(2,pow));

            pow++;
            n/=10;
        }
        System.out.println(dec);


    }
    public static void main(String[] args) {
//        int n= 20112003;
//        int rev = 0;
//        while(n>0){
////             ;
//            int ld = n%10;
//            rev = (rev *10) + ld;
//            n/=10;
//
//
//        }
//        System.out.println(rev);
         int prod= multiply(5,3);
//
//        System.out.println(prod);
//        System.out.println(factorial(6));
//        System.out.println(isprime(11));
//
//        rangeinprime(100);
      bintodec(101);
    }

}