import java.util.Scanner;

public class palindromefunction {

    public static boolean palindrome(int n){
        int rev=0;
        int pow=0;
        while(n!=0){
            int rem= n%10;
            rev= (rev *10) +rem;
            pow++;
            rev = n/10;
        }
        if (n==rev){
            return true;
        }
        else{
            return false;
        }




    }


    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int palindromeno = sc.nextInt();
     palindrome(121);

    }
}
