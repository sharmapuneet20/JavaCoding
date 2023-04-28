public class advancepatterns {
    public static void hollow_rectangle(int tot_rows, int tot_cols){
        for (int i=1; i<=tot_rows; i++){
            for (int j=1; j<=tot_cols; j++){
                if (i==1 || i==tot_rows || j==1 || j==tot_cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }


    }
    public static void inverted_rotated_half_pyramid(int n){
        for (int i=1; i<=n; i++){
//            spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
//            stars
            for (int j=1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println( );
        }
    }
    public static void inverted_half_pyramid_with_no(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyd_triangle(int n){
        int counter=1;
        for (int i=1;i<=n;i++){
            for (int j=1; j<=i; j++){
                System.out.print(counter +" ");
               counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_pattern(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ((i+j) %2 ==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
    public static void butterfly(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n ; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
        public static void solid_rhombus(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
        public static void diamond(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= (n - i); j++) {
                    System.out.print(" ");
                }
//             stars
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
            for (int i = n; i >= 1; i--) {
                 {
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print(" ");
                    }
//             stars
                    for (int j = 1; j <= (2 * i) - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }

    public static void main(String[] args) {
//        hollow_rectangle(4,5);
//        inverted_rotated_half_pyramid(4);
//   inverted_half_pyramid_with_no(5);
// floyd_triangle(5);
//        zero_one_pattern(5);
//        butterfly(5);
//        solid_rhombus(7);
        diamond(5);
    }
}
