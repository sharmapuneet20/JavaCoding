import java.util.*;
public class statementbreak {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

       while(true){
           System.out.println("enter the number:");
           int num= sc.nextInt();
           if(num%10==0){
               break;
           }

       }

    }
}
