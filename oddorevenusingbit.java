
public class oddorevenusingbit{

    public static void oddoreven(int n){
        int bitmask=1;
        if ((n&bitmask)==0){
            System.out.println("even number");
        }else {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddoreven(3);
        oddoreven(6);
        oddoreven(1231);
    }

}

