public class largestnoinarray {
    public static void main(String[] args) {
        int numbers[]= { 2,4,6,7,5};
        System.out.println(largestnumofarray(numbers));

    }
    public static int largestnumofarray(int numbers[]){
        int Largest = Integer.MIN_VALUE; // -infinity value
        int Smallest = Integer.MAX_VALUE; // +infinity value
        for (int i=0; i<numbers.length; i++){
            if (Largest< numbers[i]){
                Largest= numbers[i];
            }
            if ( Smallest >numbers[i]){
                Smallest= numbers[i];
            }

        }
        System.out.println("smallest no is: "+Smallest);
        return Largest;
     }
}
