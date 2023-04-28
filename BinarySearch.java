public class BinarySearch {;
    public static void main(String[] args) {
        int numbers[] = {2,4,6,7,8,10,23,25,27};
        int key=10;
        System.out.println("index is:"+Binary_Search_function(numbers,key));
    }
    public static int Binary_Search_function(int numbers[], int key){
        int start = 0;
        int  end= numbers.length - 1 ;
        while(start<=end){
            int mid= (start + end)/2;
            if (numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]<key){
                start= mid+1;
            }else {
                end= mid -1;
            }

        }
        return -1;
    }

}
