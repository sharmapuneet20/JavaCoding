public class linsearch {
//     to find index of a number in a array
//    public static int linearSearch(int numbers[], int key){
//        for (int i=0; i<numbers.length; i++){
//            if (numbers[i]==key){
//                return i;
//            }
//        }
//        return -1;
//
//    }



    public static void main(String[] args) {
        int numbers[] ={2,4,6,7,8,10,23,25,27};
        int key = 10;

         int index =linearSearch(numbers,key);
        if (index==-1){
            System.out.println("not found");
        }
        else {
            System.out.println("found at " + index);
        }

    }
    public static int linearSearch(int numbers[], int key){
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]==key){
                return i;
            }
        }
        return -1;

    }
}
