import java.util.*;

public class loops {
    public static void main(String[] args) {
//        int counter=0;
//        while(counter<=10){
//            System.out.println("hello world");
//            counter++;
//        }
//        n print from 1 to 10
//        int num=1;
//        while(num<=10){
//            System.out.println(num);
//            num++;
//        }
//        no print from 1 to n
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");
        int num= sc.nextInt();
        int counter =1;
        int sum= 0;
        while(counter<=num){
            sum=sum + counter;
            counter++;


        }
        System.out.println(sum);
    }
}
