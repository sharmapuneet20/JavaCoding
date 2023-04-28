public class Reverseanarray {
    public static void main(String[] args) {
        int numbers[] = {2,3,5,7,9,10};
        array_rev(numbers);
//        print
        for (int i=0; i< numbers.length; i++){
            System.out.print(numbers[i] +" ");
        }
        System.out.println();

    }
    public static void array_rev( int numbers[]){
        int first =0 ; int last = numbers.length - 1;
        while(first<last){
            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first] = temp;
            first ++ ; last-- ;
        }

    }
}
