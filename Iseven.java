public class Iseven {

    public static boolean check_even(int n){
        if (n%2==0){
           return true;

        }
        return false;
    }
    public static void palindrome(int n){
        int temp;
        int rev= 0 ;
        temp= n;
        while(n>0) {
            int last_digit = n % 10;
            rev = (rev * 10)+ last_digit;

            n/=10;

        }
        if (rev==temp){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
        System.out.println();


    }

    public static int sum_of_digits(int n){
        int sum=0;
        while(n>0){
            int last_digit = n%10;
            sum = sum + last_digit;
            n/=10;
//            System.out.println(sum);

        }
        return sum;
    }

    public static void main(String[] args) {
//        System.out.println(check_even(7));
//        palindrome(999);
        System.out.print(sum_of_digits(143));
    }
}
