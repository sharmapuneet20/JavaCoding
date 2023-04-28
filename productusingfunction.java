public class productusingfunction {
    public static int productoftwonums(int num1 , int num2){
        int product= num1 * num2;
        return product;
    }
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int prod =productoftwonums(a , b );
        System.out.println(prod);
         prod= productoftwonums(20,12);
        System.out.println(prod);
    }
}
