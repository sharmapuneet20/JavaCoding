public class ls {
    public static int linear_search(int numbers[], int key){
        for (int i=0; i<numbers.length; i++){
            if(numbers[i]== key){
                return i ;
            }
        }
        return -1;
    }

//    largest number in  given array
     public static int getLargest(int numbers[]){

        int largest = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++){
            if (largest< numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
     }

    public static void main(String[] args) {



        int numbers[] = { 2,4,6,8,10,12,14,16};
//        int key=11;
//
//        int index= linear_search(numbers, key);
//        if(index== -1){
//            System.out.println("not found");
//        }else {
//            System.out.println("key is at index " + index);
//
//        }
        System.out.println( " largest value is " + getLargest(numbers));


    }
}
