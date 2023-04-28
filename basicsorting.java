 import java.util.Arrays;
 import java.util.Collections;

 public class basicsorting {

    public static void bubble_sort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){

            for (int j=0; j<arr.length-1-turn; j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionsort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            int min_position= i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[min_position] > arr[j]){
                    min_position = j;
                }
            }
//            swap
            int temp = arr[min_position];
            arr[min_position] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printarr(Integer arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
         Integer arr[] =  {5,4,1,3,2};
//         bubble_sort(arr);

//         selectionsort(arr);
        Arrays.sort(arr, Collections.reverseOrder());


        printarr(arr);
    }
}
