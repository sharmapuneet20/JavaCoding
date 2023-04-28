public class pairsarray {

    public static void pairs_array(int numbers[]){
        int tp =0;
        for (int i=0; i<numbers.length ; i++){
            int curr = numbers[i];

            for (int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr +"," +numbers[j] +")");
            tp++;

            }
            System.out.println();

        }
        System.out.println("total pairs are:" +tp);

    }
    public static void printsubarrays(int numbers[]){
        int ts=0;
        for (int i=0; i< numbers.length; i++){
            int start = i;
            for (int j=i ;j<numbers.length; j++){
                int end =j;
                for (int k =start; k<=end; k++){
                    System.out.print(numbers[k] +" ");

                }

                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
//        pairs_array(numbers);
        printsubarrays(numbers);
    }
}
