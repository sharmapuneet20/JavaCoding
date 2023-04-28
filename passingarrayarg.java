public class passingarrayarg {

    public static void update(int marks[]){

        for (int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }

    }
    public static void main(String[] args) {
         int marks[]= {56,45,77};
         update(marks);
//         print mark
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
        for (int i=0; i<marks.length; i++){
            System.out.print(marks[i ]+" ");
        }


    }
}
